package com.company.Game.Towers;

import com.company.Game.Mobs.Mob;

import java.util.ArrayList;

/**
 * Created by zackli on 7/30/16.
 */
public class MageTower extends Tower{
    //attackSpeed, Damage, Range, x, y, Cost
    public MageTower(double x_pos, double y_pos){
        super(8, 50, 8, x_pos, y_pos, 300);
    }

    public void attack(ArrayList<Mob> mobs){
        for(Mob m: mobs){
            m.reduceHealth(getDamage());
        }
    }

    public void upgrade(){
        setAtk_spd(16);
        setDamage(50);
        setRange(10);
        player.changeMoney(-400);

    }
}
