package com.company.Game.Mobs;

import com.company.Game.Paths.Path;
import com.company.Game.Player;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by zackli on 7/30/16.
 */
public abstract class Mob {
    private BufferedImage image;

    private int health;
    private double speed;
    private double xPos;
    private double yPos;
    private boolean active;
    Player player;

    Color color;

    private int pathIndex;

    public Mob(int health, double speed, double xPos, double yPos, Player player, String filename) {
        this.health = health;
        this.speed = speed;
        this.xPos = xPos;
        this.yPos = yPos;
        this.pathIndex = 0;
        this.player = player;

        try {
            //ImageIcon(getClass().getResource("./Akari.png"))
            //getresource seems to work with the current folder
            //ImageIO.read seems to go up to source folder

            image = ImageIO.read(new File("./src/com/company/Game/Mobs/" +filename));
//		      image = ImageIO.read(new File("kms.jpg"));
        } catch (IOException ex) {
            // handle exception...
            System.out.println("picture error");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

    public int getHealth() {
        return health;
    }

    public double getSpeed() {
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

    public void setSpeed(double speed) {
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
            Point target = path.getPointAtIndex(pathIndex);
            if (move(target)) {
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

        if(x<speed && x>-speed && y<speed && y>-speed){
            return true;
        }else{
            double distanceSquared = x*x + y*y;
            double distance = Math.sqrt(distanceSquared);
            xPos += speed * x / distance;
            yPos += speed * y / distance;

            return false;
        }

    }

    public boolean isActive(){
        return active;
    }

    public void activate(){
        active = true;
    }

    public void reduceHealth(int damage){
        health -= damage;
    }

    public void die(){
        setSpeed(0);
        setxPos(-100);
        setyPos(0);
    }

    public boolean act(Path p){
        //returns true if dead
        if(active) {
            if (health > 0){
                if(move(p)){
                    die();
                    player.reduceHealth();
                    System.out.println(player.getHealth());
                    return true;
                }
            }else{
                die();
                player.changeMoney(100);
                System.out.println(player.getMoney());

                return true;
            }
        }
        return false;
    }

    public void draw(Graphics g){
        g.setColor(color);
//        g.fillRect((int)xPos - 15, (int)yPos - 15, 30, 30);
        g.drawImage(image, (int)xPos - 20, (int)yPos - 20, null);
    }


}
