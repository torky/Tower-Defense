package com.company.Game.Levels;

import com.company.Game.Paths.Path;
import com.company.Game.Player;

/**
 * Created by zacklee on 7/31/16.
 */
public class Level2 extends Level{
    Path path;

    public Level2(Path p, Player player){
        super(p, 9, player);
        path = p;
        addMob(5, NICK);
        addMob(5, SLOW_NICK);

        bonusForPassingLevel = 200;
    }


}
