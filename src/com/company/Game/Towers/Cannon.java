package com.company.Game.Towers;

import com.company.Game.Mobs.Mob;
import com.company.Game.Projectiles.Projectile;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zacklee on 7/30/16.
 */
public class Cannon extends Tower{
    //attackSpeed, Damage, Range, x, y, Cost
    public Cannon(double x_pos, double y_pos) {
        super(50, 95, 100, x_pos, y_pos, 300, "Chinatsu.png");
        color = Color.WHITE;
    }

    public void attack(ArrayList<Mob> mobs){
        atk_coolDown++;
        if(atk_coolDown>= getAtkPeriod()) {

            Mob target = closestMob(mobs);
            if (target != null && target.isActive()) {
                if (distanceSquared(target.getxPos(), target.getyPos()) <= getRange() * getRange()) {
                    projectiles.add(new Projectile(15, getDamage(), getX_pos(), getY_pos(), target, 15));
                    System.out.println("Attacking");
                    atk_coolDown = 0;
                }
            }
        }

        Iterator<Projectile> iter = projectiles.iterator();
        while (iter.hasNext()){
            Projectile p = iter.next();
            if(p!=null){
                p.act();
                if (p.isHasHit() || p.getMob().getHealth()<=0){
                    iter.remove();
                }
            }
        }
    }

    public void upgrade(){
        setAtkPeriod(35);
        setDamage(200);
        setRange(120);
    }

}
