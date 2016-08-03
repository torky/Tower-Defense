package com.company.Game.Levels;

import com.company.Game.Paths.Path;

/**
 * Created by zackli on 8/1/16.
 */
public class Level4 extends Level{
    Path path;

    public Level4(Path p){
        super(p, 7);
        path = p;
        addMob(2, NICK);
        addMob(3, SLOW_NICK);
        addMob(3, FAST_NICK);
        addMob(1, NICK);
        addMob(5, SLOW_NICK);


        bonusForPassingLevel = 400;
    }


}