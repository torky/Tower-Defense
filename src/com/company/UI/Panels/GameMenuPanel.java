package com.company.UI.Panels;

import com.company.Controllers.GameController;
import com.company.UI.Buttons.TowerButton;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tylercai on 7/31/16.
 */
public class GameMenuPanel extends JPanel {

    public GameController gc;
    public TowerButton archerTower;
    public TowerButton cannon;
    public TowerButton mageTower;
    public TowerButton superTower;

    public GameMenuPanel(GameController gc){
        this.gc = gc;

        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        archerTower = new TowerButton("Archer Tower", GameController.ARCHER_TOWER, gc);
        cannon = new TowerButton("Cannon", GameController.CANNON, gc);
        mageTower = new TowerButton("Mage Tower", GameController.MAGE_TOWER, gc);
        superTower = new TowerButton("Super Tower", GameController.SUPER_TOWER, gc);
        this.add(archerTower);
        this.add(cannon);
        this.add(mageTower);
        this.add(superTower);
        archerTower.setVisible(true);
        cannon.setVisible(true);
        mageTower.setVisible(true);
        superTower.setVisible(true);

        this.setSize(100, 600);
        this.setPreferredSize(new Dimension(100, 600));
        this.setBackground(Color.BLACK);
        this.setVisible(true);
    }
}
