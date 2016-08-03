package com.company.Game.Levels;

import com.company.Game.Mobs.*;
import com.company.Game.Paths.Path;
import com.company.Game.Player;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by tylercai on 7/30/16.
 */
public abstract class Level {

    private ArrayList<Mob> mobs = new ArrayList<Mob>();
    int numberOfNick;
    int numberOfFatNick;
    int numberOfFastNick;
    int numberOfSlowNick;
    int ticks;
    int initialNumberOfNicks;
    Player player;

    int bonusForPassingLevel;

    int currentTicks;
    int currentMobIndex;

    Path path;
    int startX;
    int startY;

    public final static int NICK = 0;
    public final static int FAT_NICK = 1;
    public final static int FAST_NICK = 2;
    public final static int SLOW_NICK = 3;
    public final static int SUPER_FAT_NICK = 4;


    public Level(Path p, int ticks, Player player) {
        path = p;
        startX = (int)p.getPointAtIndex(0).getX();
        startY = (int)p.getPointAtIndex(0).getY();
        currentTicks = 0;
        currentMobIndex = 0;
        this.ticks = ticks;
        initialNumberOfNicks = 0;
        this.player = player;
    }

    public void addMob(int number, int type){
        for(int i = 0; i < number; i++){
            Mob m = null;
            switch(type){
                case NICK:
                    m = new Nick(startX, startY, player);
                    break;
                case FAT_NICK:
                    m = new FatNick(startX, startY, player);
                    break;
                case FAST_NICK:
                    m = new FastNick(startX, startY, player);
                    break;
                case SLOW_NICK:
                    m = new SlowNick(startX, startY, player);
                    break;
                case SUPER_FAT_NICK:
                    m = new SuperFatNick(startX, startY, player);
                    break;
            }
            if(m!=null)
            {
                mobs.add(m);
                initialNumberOfNicks++;
            }
        }
    }

    public ArrayList<Mob> getMobs(){
        return mobs;
    }

    public Mob getMob(int index){
        return mobs.get(index);
    }

    public void resetTicks()
    {
        currentTicks = 0;
    }

    public int getBonusForPassingLevel(){
        return bonusForPassingLevel;
    }

    public boolean allMobsDead(){
        return mobs.isEmpty();

    }

    public void runMobs(){
        Iterator<Mob> iter = mobs.iterator();
//        System.out.println(mobs.size());
        while (iter.hasNext()){
            Mob m = iter.next();
            if (m.act(path)){
                System.out.println("Mob died");
                iter.remove();
            }
        }
    }

    public Path getPath(){
        return path;
    }

    //returns true if mobs are all gone
    public void releaseMobs(){
        if(initialNumberOfNicks > currentMobIndex) {
            currentTicks++;
            if (currentTicks >= ticks) {
                for (Mob m : mobs){
                    if (!m.isActive()){
                        m.activate();
                        break;
                    }
                }
                currentMobIndex++;
                resetTicks();
                System.out.println("Releasing a Mob");
            }
        }
    }
}
