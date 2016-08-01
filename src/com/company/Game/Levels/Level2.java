package com.company.Game.Levels;

import com.company.Game.Paths.Path;

/**
 * Created by zackli on 7/31/16.
 */
public class Level2 extends Level{
    Path path;

    public Level2(Path p){
        super(p);
        path = p;
        addMob(5, NICK);
        addMob(5, SLOW_NICK);

        bonusForPassingLevel = 200;
    }

    public void releaseMobs(){
        if(getMobs().size()> currentMobIndex) {
            currentTicks++;
            if (currentTicks >= 9) {
                getMob(currentMobIndex).activate();
                currentMobIndex++;
                resetTicks();
                System.out.println("Releasing a Mob");
            }
        }
    }

}
