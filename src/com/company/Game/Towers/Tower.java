package com.company.Game.Towers;

import com.company.Game.Mobs.Mob;
import com.company.Game.Player;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zackli on 7/30/16.
 */
abstract public class Tower {
    private int atkPeriod;
    int atk_coolDown;
    private int damage;
    private double range;
    private double x_pos;
    private double y_pos;
    private int price;
    Color color;

    Player player;

    public Tower(int atkPeriod, int damage, double range, double x_pos, double y_pos, int price){
        this.atkPeriod = atkPeriod;
        this.damage = damage;
        this.range = range;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.price = price;
        this.atk_coolDown = 0;
    }

    public int getAtkPeriod() {
        return atkPeriod;
    }

    public int getDamage() {
        return damage;
    }

    public double getRange() {
        return range;
    }

    public double getX_pos() {
        return x_pos;
    }

    public double getY_pos() {
        return y_pos;
    }

    public int getPrice() {
        return price;
    }

    public void setAtkPeriod(int atk_spd) {
        this.atkPeriod = atk_spd;
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

    abstract public void attack(ArrayList<Mob> mobs);

    public Mob closestMob(ArrayList<Mob> mobs){
        if(!mobs.isEmpty()){
            Mob target = mobs.get(0);
            double distanceSquared = distanceSquared(target.getxPos(), target.getyPos());
            for(Mob m: mobs){
                double mobDistanceSquared = distanceSquared(m.getxPos(), m.getyPos());
                if(mobDistanceSquared<distanceSquared){
                    target = m;
                    distanceSquared = mobDistanceSquared;
                }
            }

            return target;
        }

        return null;
    }

    public double distanceSquared(double x_pos, double y_pos){
        double x = getX_pos() - x_pos;
        double y = getY_pos() - y_pos;

        double distanceSquared = x*x + y*y;
        return distanceSquared;
    }

    public void sell(){
        player.changeMoney((int)(price * .8));
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.drawRect((int)x_pos - 15, (int)y_pos - 15, 30, 30);
    }
    abstract public void upgrade();


}
