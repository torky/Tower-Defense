package com.company.Game.Mobs;

/**
 * Created by zackli on 7/30/16.
 */
public abstract class Mob {
    private int health;
    private int speed;
    private float x_pos;
    private float y_pos;

    public Mob(int health, int speed, float x_pos, float y_pos) {
        this.health = health;
        this.speed = speed;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public float getX_pos() {
        return x_pos;
    }

    public float getY_pos() {
        return y_pos;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setX_pos(float x_pos) {
        this.x_pos = x_pos;
    }

    public void setY_pos(float y_pos) {
        this.y_pos = y_pos;
    }




    public void move(){

    }

    public void reduceHealth(int damage){
        health -= damage;
    }

    public void die(){

    }

}
