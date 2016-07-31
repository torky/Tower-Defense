package com.company.Game;

import com.company.Game.Levels.Level;
import com.company.Game.Levels.Level1;
import com.company.UI.Panels.GamePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by tylercai on 7/30/16.
 */
public class Game implements ActionListener{

    ArrayList<Level> levels = new ArrayList<Level>();
    Timer tm = new Timer(50, this);
    int currentLevel;
    Level activeLevel;
    private Player player;
    private Path path;
    private GamePanel gp;

    public Game(GamePanel gp){
        player = new Player();
        path = new Path();
        levels.add(new Level1(path));
        currentLevel = 0;
        this.gp = gp;
    }

    public void startNextLevel(){
        activeLevel = levels.get(currentLevel);
        activeLevel.resetTicks();
        start();
    }

    public Player getPlayer(){
        return player;
    }

    public void start(){
        tm.start();
    }

    public void stop(){
        tm.stop();
    }

    public void actionPerformed(ActionEvent e) {
        activeLevel.releaseMobs();
        if(activeLevel.allMobsDead()){
            currentLevel++;
            player.changeMoney(activeLevel.getBonusForPassingLevel());
            stop();
        }
        activeLevel.runMobs();
        player.runTowers(activeLevel.getMobs());
        gp.repaint();
    }

    public Level getActiveLevel(){
        return activeLevel;
    }
}
