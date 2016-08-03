package com.company.Game;

import com.company.Game.Levels.*;
import com.company.Game.Paths.Path;
import com.company.Game.Paths.Path2;
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

    private boolean notDefeated;

    public Game(GamePanel gp){
        player = new Player();
        path = new Path2();
        levels.add(new Level1(path, player));
        levels.add(new Level2(path, player));
        levels.add(new Level3(path, player));
        levels.add(new Level4(path, player));
        levels.add(new Level5(path, player));
        levels.add(new Level6(path, player));

        currentLevel = 0;
        this.gp = gp;
        notDefeated = true;
    }

    public void startNextLevel(){
        if(notDefeated) {
            activeLevel = levels.get(currentLevel);
            activeLevel.resetTicks();
            start();
        }else{
            JOptionPane.showMessageDialog(null, "You just let Nick get too much Yuri. What a disgrace.");
        }
    }

    public Path getPath(){
        return path;
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
        if(player.defend(activeLevel.getMobs())){
            stop();
            notDefeated = false;
            JOptionPane.showMessageDialog(null, "You just let Nick get too much Yuri. What a disgrace.");
        }
        gp.repaint();
    }

    public Level getActiveLevel(){
        return activeLevel;
    }
}
