package com.company.UI;

import com.company.Controllers.GameController;
import com.company.Game.Mobs.Mob;
import com.company.Game.Path;
import com.company.Game.Towers.Tower;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tylercai on 7/30/16.
 */
public class GamePanel extends JPanel{

    private MainPanel main;
    private GameController gc;

    public GamePanel(MainPanel main){
        this.main = main;
        gc = new GameController(this);
        this.addMouseListener(gc);
        this.addKeyListener(gc);
        this.setBackground(Color.GREEN);
        this.setSize(800, 600);
    }

    public void paintComponent(Graphics g){
        for(Tower t : gc.getGame().getPlayer().getTowers()){
            t.draw(g);
        }

        if(gc.getGame().getActiveLevel() != null) {
            for (Mob m : gc.getGame().getActiveLevel().getMobs()) {
                m.draw(g);
            }

            Path path = gc.getGame().getActiveLevel().getPath();
            path.draw(g);
        }
    }

}
