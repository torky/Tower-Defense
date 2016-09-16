package com.company.Game.Levels;

import com.company.Game.Paths.Path;
import com.company.Game.Player;

/**
 * Created by zacklee on 8/1/16.
 */
public class Level5 extends Level{
    Path path;

    public Level5(Path p, Player player){
        super(p,6, player);
        path = p;
        addMob(2, NICK);
        addMob(3, SLOW_NICK);
        addMob(5, FAST_NICK);
        addMob(2, NICK);
        addMob(5, SLOW_NICK);
        addMob(5, FAST_NICK);
        addMob(1, FAT_NICK);


        bonusForPassingLevel = 400;
    }


}