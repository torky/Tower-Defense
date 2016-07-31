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

    boolean hasHit = false;

    Mob mob;

    public Projectile(double speed, int damage, double x, double y, Mob m){
        this.speed = speed;
        this.damage = damage;
        this.xPos = x;
        this.yPos = y;
        this.mob = m;
    }

    //return true if we are close enough to the enemy mob
    public void move(Mob mob) {
        double x = mob.getxPos() - xPos;
        double y = mob.getyPos() - yPos;
        if (x < 10 && x > -10 && y < 10 && y > -10) {
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
        if(!hasHit) {
            move(mob);
        }else{
            xPos = -100;
            yPos = 0;
        }
    }

    public boolean isHasHit(){
        return hasHit;
    }

    public void draw(Graphics g){
        g.fillOval((int)xPos - 5, (int)yPos - 5, 10, 10);
    }
}
