package com.company.Game.Towers;

import com.company.Game.Player;

/**
 * Created by zackli on 7/30/16.
 */
public class SuperTower extends Tower{
    public SuperTower(float x_pos, float y_pos, Player player){
        super(20, 50, 15, x_pos, y_pos, 1000, player);
    }

    public void attack(){

    }

    public void upgrade(){
        setAtk_spd(40);
        setDamage(60);
        setRange(20);
        player.ChangeMoney(-1500);
    }
}
