package com.company.Game.Levels;

import com.company.Game.Path;
import com.company.Game.Player;

/**
 * Created by tylercai on 7/30/16.
 */
public class Level1 extends Level{

    public Level1(Path p){
        super(p);
        numberOfNick = 10;
        addNick(numberOfNick, NICK);
        bonusForPassingLevel = 100;
    }

    public void releaseNextMob(){
        if(getMobs().size()>currentMob) {
            currentTicks++;
            if (currentTicks >= 100) {
                getMob(currentMob).activate();
                currentMob++;
                resetTicks();
                System.out.println("Releasing a Mob");
            }
        }
    }
}
