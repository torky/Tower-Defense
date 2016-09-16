package com.company.Game.Levels;

import com.company.Game.Paths.Path;
import com.company.Game.Player;

/**
 * Created by zacklee on 16-08-22.
 */
public class Level7 extends Level{
    Path path;

    public Level7(Path p, Player player){
        super(p, 4, player);
        path = p;
        addMob(10, NICK);
        addMob(3, SLOW_NICK);
        addMob(10, FAST_NICK);
        addMob(2, NICK);
        addMob(5, SLOW_NICK);
        addMob(10, FAST_NICK);
        addMob(3, FAT_NICK);
        addMob(15, FAST_NICK);
        addMob(4, FAT_NICK);
        addMob(3, SUPER_FAT_NICK);



        bonusForPassingLevel = 400;
    }
}
