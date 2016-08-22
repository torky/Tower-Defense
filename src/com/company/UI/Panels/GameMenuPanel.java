package com.company.UI.Panels;

import com.company.Controllers.GameController;
import com.company.Game.Towers.ArcherTower;
import com.company.Game.Towers.Cannon;
import com.company.Game.Towers.MageTower;
import com.company.Game.Towers.SuperTower;
import com.company.UI.Buttons.*;


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

    public NextLevel nextLevel;

    public JTextField playerHealth;
    public JLabel playerHealthLabel;
    public JTextField playerMoney;
    public JLabel playerMoneyLabel;

    public GameMenuPanel(GameController gc){
        this.gc = gc;

        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        archerTower = new TowerButton("Archer Tower-" + 100, GameController.ARCHER_TOWER, gc);
        cannon = new TowerButton("Cannon-" + 300, GameController.CANNON, gc);
        mageTower = new TowerButton("Mage Tower-" + 300, GameController.MAGE_TOWER, gc);
        superTower = new TowerButton("Super Tower-" + 1000, GameController.SUPER_TOWER, gc);

        nextLevel = new NextLevel(gc);

        playerHealth = new JTextField();
        playerHealth.setText(String.valueOf(gc.getGame().getPlayer().getHealth()));
        playerHealth.setEditable(false);
        playerHealthLabel = new JLabel("<html><font color='white'>Health</font></html>");

        playerMoney = new JTextField();
        playerMoney.setText(String.valueOf(gc.getGame().getPlayer().getMoney()));
        playerMoney.setColumns(5);
        playerMoney.setEditable(false);
        playerMoneyLabel = new JLabel("<html><font color='white'>Money</font></html>");

        this.add(playerMoneyLabel);
        this.add(playerMoney);

        this.add(archerTower);
        this.add(cannon);
        this.add(mageTower);
        this.add(superTower);

        this.add(nextLevel);

        this.add(playerHealthLabel);
        this.add(playerHealth);

        this.setPreferredSize(new Dimension(150, 600));
        this.setBackground(Color.BLACK);
        this.setVisible(true);
    }

    public void updateMoney(String text){
        playerMoney.setText(text);
    }

    public void updateHealth(String text){
        playerHealth.setText(text);
    }
}
