package com.company.Game.Towers;

import com.company.Game.Mobs.Mob;

import java.util.ArrayList;

/**
 * Created by zackli on 7/30/16.
 */
public class SuperTower extends Tower{
    //attackSpeed, Damage, Range, x, y, Cost
    public SuperTower(double x_pos, double y_pos){
        super(20, 50, 15, x_pos, y_pos, 1000);
    }

    public void attack(ArrayList<Mob> mobs){
        for(Mob m: mobs){
            m.reduceHealth(getDamage());
        }
    }

    public void upgrade(){
        setAtk_spd(40);
        setDamage(60);
        setRange(20);
        player.changeMoney(-1500);
    }
}
