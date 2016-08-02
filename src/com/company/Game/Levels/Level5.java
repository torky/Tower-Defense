package com.company.Game.Levels;

import com.company.Game.Paths.Path;

/**
 * Created by zackli on 8/1/16.
 */
public class Level5 extends Level{
    Path path;

    public Level5(Path p){
        super(p);
        path = p;
        addMob(1, NICK);
        addMob(2, SLOW_NICK);
        addMob(1, FAST_NICK);
        addMob(1, NICK);
        addMob(5, SLOW_NICK);
        addMob(5, FAST_NICK);
        addMob(1, FAT_NICK);




        bonusForPassingLevel = 400;
    }

    public void releaseMobs(){
        if(getMobs().size()> currentMobIndex) {
            currentTicks++;
            if (currentTicks >= 6) {
                getMob(currentMobIndex).activate();
                currentMobIndex++;
                resetTicks();
                System.out.println("Releasing a Mob");
            }
        }
    }

}