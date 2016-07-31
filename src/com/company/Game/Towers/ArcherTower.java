package com.company.Game.Towers;
import com.company.Game.Mobs.Mob;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zackli on 7/30/16.
 */
public class ArcherTower extends Tower {
    //attackSpeed, Damage, Range, x, y, Cost
    public ArcherTower(double x_pos, double y_pos){
        super(20, 10, 100, x_pos, y_pos, 100);
        color = Color.BLACK;

    }

    public void attack(ArrayList<Mob> mobs){
        atk_coolDown++;
        if(atk_coolDown>=getAtk_spd()) {

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
        setAtk_spd(15);
        setDamage(15);
        setRange(12);
        player.changeMoney(-125);


    }


}
