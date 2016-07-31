package com.company.Game;

/**
 * Created by zackli on 7/30/16.
 */
public class Player {
    private int money;
    private int health;

    public Player() {
        this.money = 600;
        this.health = 100;
    }

    public void ChangeMoney(int change){
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
}
