package com.company.Game.Mobs;

import com.company.Game.Path;

import java.awt.*;

/**
 * Created by zackli on 7/30/16.
 */
public abstract class Mob {
    private int health;
    private int speed;
    private double xPos;
    private double yPos;
    private boolean active;

    Color color;
    public boolean dead;

    private int pathIndex;

    public Mob(int health, int speed, double xPos, double yPos) {
        this.health = health;
        this.speed = speed;
        this.xPos = xPos;
        this.yPos = yPos;
        this.pathIndex = 0;

        this.dead = false;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setxPos(float xPos) {
        this.xPos = xPos;
    }

    public void setyPos(float yPos) {
        this.yPos = yPos;
    }

    //returns true if it has reached the end of its path
    public boolean move(Path path){
        if(path.length() > pathIndex) {
            if (move(path.getPointAtIndex(pathIndex))) {
                pathIndex++;
            }
            return false;
        }else{
            return true;
        }
    }

    //returns true if it has reached the end of its path
    public boolean move(Point p){

        double x = p.getX() - xPos;
        double y = p.getY() - yPos;

        double distanceSquared = x*x + y*y;
        double distance = Math.sqrt(distanceSquared);
        xPos = xPos + speed * x / distance;
        yPos = yPos + speed * y / distance;

        if(x<1 && x>-1 && y<1 && y>-1){
            return true;
        }else{
            return false;
        }

    }

    public void activate(){
        active = true;
    }

    public void reduceHealth(int damage){
        health -= damage;
    }

    public void die(){
        dead = true;
        setSpeed(0);
        setxPos(-100);
        setyPos(0);
    }

    public void act(Path p){
        if(active) {
            if (health > 0){
                move(p);
            }else{
                die();
            }
        }
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect((int)xPos - 15, (int)yPos - 15, 30, 30);
    }
}
