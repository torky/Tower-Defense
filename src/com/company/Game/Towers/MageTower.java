package com.company.Game.Towers;

import com.company.Game.Mobs.Mob;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zackli on 7/30/16.
 */
public class MageTower extends Tower{
    //attackSpeed, Damage, Range, x, y, Cost
    public MageTower(double x_pos, double y_pos){
        super(30, 50, 80, x_pos, y_pos, 300);
        color = Color.BLUE;
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
        setAtkPeriod(15);
        setDamage(60);
        setRange(100);
        player.changeMoney(-400);

    }
}
