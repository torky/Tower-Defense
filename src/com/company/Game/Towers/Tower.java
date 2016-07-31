package com.company.Game.Towers;

import com.company.Game.Player;

/**
 * Created by zackli on 7/30/16.
 */
abstract public class Tower {
    private float atk_spd;
    private int damage;
    private float range;
    private float x_pos;
    private float y_pos;
    private int price;

    Player player;

    public Tower(float atk_spd, int damage, float range, float x_pos, float y_pos, int price, Player player){
        this.atk_spd = atk_spd;
        this.damage = damage;
        this.range = range;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.price = price;
        this.player = player;
    }

    public float getAtk_spd() {
        return atk_spd;
    }

    public int getDamage() {
        return damage;
    }

    public float getRange() {
        return range;
    }

    public float getX_pos() {
        return x_pos;
    }

    public float getY_pos() {
        return y_pos;
    }

    public int getPrice() {
        return price;
    }

    public void setAtk_spd(float atk_spd) {
        this.atk_spd = atk_spd;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setRange(float range) {
        this.range = range;
    }

    public void setX_pos(float x_pos) {
        this.x_pos = x_pos;
    }

    public void setY_pos(float y_pos) {
        this.y_pos = y_pos;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    abstract public void attack();

    public void sell(){
        player.ChangeMoney(price);
    }

    abstract public void upgrade();


}
