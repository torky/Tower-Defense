package com.company.Game.Towers;

import com.company.Game.Mobs.Mob;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zackli on 7/30/16.
 */
public class SuperTower extends Tower{
    //attackPeriod, Damage, Range, x, y, Cost
    public SuperTower(double x_pos, double y_pos){
        super(7, 50, 180, x_pos, y_pos, 1000);
        color = Color.PINK;
    }

    public void attack(ArrayList<Mob> mobs){
        atk_coolDown++;
        if(atk_coolDown >= getAtkPeriod()) {

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
        setAtkPeriod(2);
        setDamage(50);
        setRange(250);
        player.changeMoney(-1500);
    }
}
