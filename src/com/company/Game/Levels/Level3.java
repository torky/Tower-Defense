package com.company.Game.Levels;

import com.company.Game.Paths.Path;

/**
 * Created by zackli on 8/1/16.
 */
public class Level3 extends Level{
    Path path;

    public Level3(Path p){
        super(p);
        path = p;
        addMob(2, NICK);
        addMob(5, SLOW_NICK);
        addMob(3, FAST_NICK);


        bonusForPassingLevel = 300;
    }

    public void releaseMobs(){
        if(getMobs().size()> currentMobIndex) {
            currentTicks++;
            if (currentTicks >= 8) {
                getMob(currentMobIndex).activate();
                currentMobIndex++;
                resetTicks();
                System.out.println("Releasing a Mob");
            }
        }
    }
}
