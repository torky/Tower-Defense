package com.company.Game.Towers;
import com.company.Game.Player;
/**
 * Created by zackli on 7/30/16.
 */
public class ArcherTower extends Tower {
    public ArcherTower(float x_pos, float y_pos, Player player){
        super(10, 10, 10, x_pos, y_pos, 100, player);

    }

    public void attack(){

    }

    public void upgrade(){
        setAtk_spd(15);
        setDamage(15);
        setRange(12);
        player.ChangeMoney(-125);


    }


}
