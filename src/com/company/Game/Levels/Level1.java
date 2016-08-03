package com.company.Game.Levels;

import com.company.Game.Paths.Path;
import com.company.Game.Player;

/**
 * Created by tylercai on 7/30/16.
 */
public class Level1 extends Level{

    Path path;

    public Level1(Path p, Player player){
        super(p, 10, player);
        path = p;
        addMob(10, NICK);
        bonusForPassingLevel = 100;

    }

}
