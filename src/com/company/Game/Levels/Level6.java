package com.company.Game.Levels;

import com.company.Game.Paths.Path;

/**
 * Created by zackli on 8/1/16.
 */
public class Level6 extends Level{
    Path path;

    public Level6(Path p){
        super(p);
        path = p;
        addMob(2, NICK);
        addMob(2, SLOW_NICK);
        addMob(10, FAST_NICK);
        addMob(2, NICK);
        addMob(5, SLOW_NICK);
        addMob(5, FAST_NICK);
        addMob(2, FAT_NICK);
        addMob(15, FAST_NICK);
        addMob(3, FAT_NICK);






        bonusForPassingLevel = 400;
    }

    public void releaseMobs(){
        if(getMobs().size()> currentMobIndex) {
            currentTicks++;
            if (currentTicks >= 5) {
                getMob(currentMobIndex).activate();
                currentMobIndex++;
                resetTicks();
                System.out.println("Releasing a Mob");
            }
        }
    }
}
