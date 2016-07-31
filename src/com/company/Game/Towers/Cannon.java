package com.company.Game.Towers;

import com.company.Game.Mobs.Mob;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zackli on 7/30/16.
 */
public class Cannon extends Tower{
    //attackSpeed, Damage, Range, x, y, Cost
    public Cannon(double x_pos, double y_pos) {
        super(50, 100, 70, x_pos, y_pos, 300);
        color = Color.WHITE;
    }

    public void attack(ArrayList<Mob> mobs){
        atk_coolDown++;
        if(atk_coolDown>= getAtkPeriod()) {

            Mob target = closestMob(mobs);
            if (target != null) {
                if (distanceSquared(target.getxPos(), target.getyPos()) <= getRange() * getRange()) {
                    target.reduceHealth(getDamage());
                    System.out.println("Attacking");
                    atk_coolDown = 0;
                }
            }
        }
    }

    public void upgrade(){
        setAtkPeriod(35);
        setDamage(200);
        setRange(80);
        player.changeMoney(-400);
    }

}
