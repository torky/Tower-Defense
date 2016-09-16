package com.company.Game.Levels;

import com.company.Game.Paths.Path;
import com.company.Game.Player;

/**
 * Created by zacklee on 8/1/16.
 */
public class Level3 extends Level{
    Path path;

    public Level3(Path p, Player player){
        super(p, 8, player);
        path = p;
        addMob(5, NICK);
        addMob(5, SLOW_NICK);
        addMob(3, FAST_NICK);


        bonusForPassingLevel = 300;
    }


}