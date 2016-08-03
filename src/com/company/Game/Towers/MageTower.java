package com.company.Game.Towers;

import com.company.Game.Mobs.Mob;
import com.company.Game.Projectiles.Projectile;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zackli on 7/30/16.
 */
public class MageTower extends Tower{
    //attackSpeed, Damage, Range, x, y, Cost
    public MageTower(double x_pos, double y_pos){
        super(30, 50, 80, x_pos, y_pos, 300);
        color = Color.BLUE;
    }

    public void attack(ArrayList<Mob> mobs){
        atk_coolDown++;
        if(atk_coolDown >= getAtkPeriod()) {

            Mob target = closestMob(mobs);
            if (target != null && target.isActive()) {
                if (distanceSquared(target.getxPos(), target.getyPos()) <= getRange() * getRange()) {
                    projectiles.add(new Projectile(20, getDamage(), getX_pos(), getY_pos(), target, 12));
                    System.out.println("Attacking");
                    atk_coolDown = 0;
                }
            }
        }
//        for(Projectile p: projectiles){
//            if(p!=null) {
//                p.act();
//                if (p.isHasHit()) {
//                    p = null;
//                    projectiles.remove(p);
//                }
//            }
//        }
        Iterator<Projectile> iter = projectiles.iterator();
        while (iter.hasNext()){
            Projectile p = iter.next();
            if(p!=null){
                p.act();
                if (p.isHasHit()){
                    iter.remove();
                }
            }
        }
    }

    public void upgrade(){
        setAtkPeriod(15);
        setDamage(60);
        setRange(100);
        player.changeMoney(-400);

    }
}
