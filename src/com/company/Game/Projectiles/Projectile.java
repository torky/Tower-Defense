package com.company.Game.Projectiles;

import com.company.Game.Mobs.Mob;

/**
 * Created by zackli on 7/31/16.
 */
abstract public class Projectile {
    double speed;
    int damage;
    float xPos;
    float yPos;

    public boolean move(Mob mob) {
        double x = mob.getxPos() - xPos;
        double y = mob.getyPos() - yPos;
        if (x < 10 && x > -10 && y < 10 && y > -10) {
            mob.reduceHealth(damage);
            return true;
        } else {
            double distancesq = x * x + y * y;
            double distance = Math.sqrt(distancesq);
            xPos += speed * x / distance;
            yPos += speed * y / distance;
        }
        return false;
    }



}
