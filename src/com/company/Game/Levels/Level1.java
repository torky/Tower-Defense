package com.company.Game.Levels;

import com.company.Game.Path;

/**
 * Created by tylercai on 7/30/16.
 */
public class Level1 extends Level{

    Path path;

    public Level1(Path p){
        super(p);
        path = p;
        numberOfNick = 10;
        addMob(numberOfNick, NICK);
        bonusForPassingLevel = 100;
    }

    public void releaseMobs(){
        if(getMobs().size()> currentMobIndex) {
            currentTicks++;
            if (currentTicks >= 100) {
                getMob(currentMobIndex).activate();
                currentMobIndex++;
                resetTicks();
                System.out.println("Releasing a Mob");
            }
        }
    }
}
