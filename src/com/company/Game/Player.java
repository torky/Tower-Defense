package com.company.Game;

/**
 * Created by zackli on 7/30/16.
 */
public class Player {
    private int money;

    public void ChangeMoney(int change){
        money += change;
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
