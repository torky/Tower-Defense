package com.company.Game;

import com.company.Game.Mobs.Mob;
import com.company.Game.Towers.*;

import java.util.ArrayList;

/**
 * Created by zackli on 7/30/16.
 */
public class Player {
    private int money;
    private int health;
    private ArrayList<Tower> towers = new ArrayList<Tower>();

    public Player() {
        this.money = 6000;
        this.health = 10;
    }

    public final static int ARCHER_TOWER = 0;
    public final static int CANNON = 1;
    public final static int MAGE_TOWER = 2;
    public final static int SUPER_TOWER = 3;

    public void changeMoney(int change){
        money += change;
    }

    public void reduceHealth(){
        health -= 1;
    }


    public int getMoney() {
        return money;
    }

    public int getHealth() {
        return health;
    }


    public void setMoney(int money) {
        this.money = money;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void addTower(int type, double startX, double startY){
        Tower t = null;
        switch(type){
            case ARCHER_TOWER:
                t = new ArcherTower(startX, startY);
                break;
            case CANNON:
                t = new Cannon(startX, startY);
                break;
            case MAGE_TOWER:
                t = new MageTower(startX, startY);
                break;
            case SUPER_TOWER:
                t = new SuperTower(startX, startY);
                break;
        }

        if(t!=null && t.getPrice() <= getMoney()) {
            changeMoney(-t.getPrice());
            towers.add(t);
        }
    }

    //returns true if defeated
    public boolean defend(ArrayList<Mob> mobs){
        if(health <= 0){
            return true;
        }

        if(!mobs.isEmpty()) {
            for (Tower t : towers) {
                t.attack(mobs);
            }
        }

        return false;
    }

    public ArrayList<Tower> getTowers(){
        return towers;
    }
}
