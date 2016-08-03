package com.company.Game.Levels;

import com.company.Game.Paths.Path;
import com.company.Game.Player;

/**
 * Created by zackli on 8/1/16.
 */
public class Level6 extends Level{
    Path path;

    public Level6(Path p, Player player){
        super(p, 5, player);
        path = p;
        addMob(2, NICK);
        addMob(2, SLOW_NICK);
        addMob(10, FAST_NICK);
        addMob(2, NICK);
        addMob(5, SLOW_NICK);
        addMob(5, FAST_NICK);
        addMob(2, FAT_NICK);
        addMob(15, FAST_NICK);
        addMob(3, FAT_NICK);



        bonusForPassingLevel = 400;
    }


}
