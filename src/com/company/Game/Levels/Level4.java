package com.company.Game.Levels;

import com.company.Game.Paths.Path;

/**
 * Created by zackli on 8/1/16.
 */
public class Level4 extends Level{
    Path path;

    public Level4(Path p){
        super(p);
        path = p;
        addMob(2, NICK);
        addMob(3, SLOW_NICK);
        addMob(3, FAST_NICK);
        addMob(1, NICK);
        addMob(5, SLOW_NICK);


        bonusForPassingLevel = 400;
    }

    public void releaseMobs(){
        if(getMobs().size()> currentMobIndex) {
            currentTicks++;
            if (currentTicks >= 7) {
                getMob(currentMobIndex).activate();
                currentMobIndex++;
                resetTicks();
                System.out.println("Releasing a Mob");
            }
        }
    }
}