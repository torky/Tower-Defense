package com.company.Game.Mobs;

import com.company.Game.Player;

import java.awt.*;

/**
 * Created by zacklee on 7/30/16.
 */
public class Nick extends Mob{
    //
    public Nick(double xPos, double yPos, Player player){
        //Health, speed, x, y
        super(100,2,xPos,yPos, player,"nick.png");
        color = Color.RED;

    }




}
