package com.company.Game.Levels;

import com.company.Game.Paths.Path;

/**
 * Created by tylercai on 7/30/16.
 */
public class Level1 extends Level{

    Path path;

    public Level1(Path p){
        super(p, 10);
        path = p;
        addMob(10, NICK);
        bonusForPassingLevel = 100;

    }

}
