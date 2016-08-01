package com.company.UI.Panels;

import com.company.Controllers.GameController;
import com.company.Game.Mobs.Mob;
import com.company.Game.Paths.Path;
import com.company.Game.Towers.Tower;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tylercai on 7/30/16.
 */
public class GamePanel extends JPanel{

    private MainPanel main;
    private GameController gc;
    private GameMenuPanel gmp;

    public GamePanel(MainPanel main){
        this.main = main;
        gc = new GameController(this);
        gmp = new GameMenuPanel(gc);
        this.addMouseListener(gc);
        this.addKeyListener(gc);
        this.setBackground(Color.GREEN);
        this.setSize(700, 600);
        this.setPreferredSize(new Dimension(700, 600));
        repaint();
    }

    public GameMenuPanel getGameMenuPanel(){
        return gmp;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Path path = gc.getGame().getPath();
        path.draw(g);

        for(Tower t : gc.getGame().getPlayer().getTowers()){
            t.draw(g);
        }

        if(gc.getGame().getActiveLevel() != null) {
            for (Mob m : gc.getGame().getActiveLevel().getMobs()) {
                m.draw(g);
            }
        }
    }

}
