package com.company.Game.Towers;

import com.company.Game.Mobs.Mob;

import java.util.ArrayList;

/**
 * Created by zackli on 7/30/16.
 */
public class Cannon extends Tower{
    //attackSpeed, Damage, Range, x, y, Cost
    public Cannon(double x_pos, double y_pos) {
        super(3, 200, 7, x_pos, y_pos, 300);
    }

    public void attack(ArrayList<Mob> mobs){
        for(Mob m: mobs){
            m.reduceHealth(getDamage());
        }
    }

    public void upgrade(){
        setAtk_spd(5);
        setDamage(300);
        setRange(8);
        player.changeMoney(-400);
    }

}
