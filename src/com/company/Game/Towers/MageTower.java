package com.company.Game.Towers;

import com.company.Game.Player;

/**
 * Created by zackli on 7/30/16.
 */
public class MageTower extends Tower{
    public MageTower(float x_pos, float y_pos, Player player){
        super(8, 50, 8, x_pos, y_pos, 300, player);
    }

    public void attack(){

    }

    public void upgrade(){
        setAtk_spd(16);
        setDamage(50);
        setRange(10);
        player.ChangeMoney(-400);

    }
}
