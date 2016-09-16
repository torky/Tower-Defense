package com.company.Game.Mobs;

import com.company.Game.Player;

import java.awt.*;

/**
 * Created by zacklee on 7/30/16.
 */
public class SlowNick extends Mob {
    public SlowNick(double xPos, double yPos, Player player){
        super(300,1,xPos,yPos, player,"slow.png");
        color = Color.YELLOW;

    }

}
