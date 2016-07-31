package com.company.Game.Levels;

import com.company.Game.Mobs.*;
import com.company.Game.Path;

import java.util.ArrayList;

/**
 * Created by tylercai on 7/30/16.
 */
public abstract class Level {

    private ArrayList<Mob> mobs = new ArrayList<Mob>();
    int numberOfNick;
    int numberOfFatNick;
    int numberOfFastNick;
    int numberOfSlowNick;

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

    public Level(Path p) {
        path = p;
        startX = (int)p.getPointAtIndex(0).getX();
        startY = (int)p.getPointAtIndex(0).getY();
        currentTicks = 0;
        currentMobIndex = 0;
    }

    public void addMob(int number, int type){
        for(int i = 0; i < number; i++){
            Mob m = null;
            switch(type){
                case NICK:
                    m = new Nick(startX, startY);
                    break;
                case FAT_NICK:
                    m = new FatNick(startX, startY);
                    break;
                case FAST_NICK:
                    m = new FastNick(startX, startY);
                    break;
                case SLOW_NICK:
                    m = new SlowNick(startX, startY);
                    break;
            }
            if(m!=null)
            {
                mobs.add(m);
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
        for(Mob m: mobs){
            if(!m.dead){
                return false;
            }
        }
        return true;
    }

    public void runMobs(){
        for(Mob m: mobs){
            m.act(path);
        }
    }

    public Path getPath(){
        return path;
    }

    //returns true if mobs are all gone
    public abstract void releaseMobs();
}
