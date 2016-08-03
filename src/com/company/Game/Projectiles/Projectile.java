package com.company.Game.Projectiles;

import com.company.Game.Mobs.Mob;

import java.awt.*;

/**
 * Created by zackli on 7/31/16.
 */
public class Projectile {
    double speed;
    int damage;
    double xPos;
    double yPos;
    int size;

    boolean hasHit = false;

    private Mob mob;

    public Projectile(double speed, int damage, double x, double y, Mob m, int size){
        this.speed = speed;
        this.damage = damage;
        this.xPos = x;
        this.yPos = y;
        this.mob = m;
        this.size = size;
    }

    //return true if we are close enough to the enemy mob
    public void move(Mob mob) {
        double x = mob.getxPos() - xPos;
        double y = mob.getyPos() - yPos;
        if (x < 18 && x > -18 && y < 18 && y > -18) {
            mob.reduceHealth(damage);
            hasHit = true;
        } else {
            double distancesq = x * x + y * y;
            double distance = Math.sqrt(distancesq);
            xPos += speed * x / distance;
            yPos += speed * y / distance;
        }
    }

    public void act(){
        if(!hasHit && mob.getHealth()>0) {
            move(mob);
        }
        else{
            xPos=-100;
        }
    }

    public boolean isHasHit(){
        return hasHit;
    }

    public void draw(Graphics g){
        g.fillOval((int)xPos - 5, (int)yPos - 5, size, size);
    }

//    public boolean equals(Object object) {
//        if(object instanceof Projectile && ((Projectile)object).id == this.id) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public boolean equals(Object obj) {
//        if (obj == null) return false;
//        if (obj == this) return true;
//        if (!(obj instanceof ArrayTest)) return false;
//        ArrayTest o = (ArrayTest) obj;
//        return o.i == this.i;
//    }

}
