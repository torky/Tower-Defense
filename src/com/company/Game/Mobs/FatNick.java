package com.company.Game.Mobs;

import com.company.Game.Player;

import java.awt.*;

/**
 * Created by zacklee on 7/30/16.
 */
public class FatNick extends Mob{
    public FatNick(double xPos, double yPos, Player player){
        super(1000,.8,xPos,yPos, player, "fast.png");
        color = Color.BLUE;
    }

}
