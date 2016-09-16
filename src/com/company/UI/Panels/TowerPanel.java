package com.company.UI.Panels;

import com.company.Controllers.GameController;
import com.company.Game.Towers.Tower;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tylercai on 9/2/16.
 */
public class TowerPanel extends JPanel implements ActionListener{

    public Tower t;

    public JButton upgrade;
    public JButton sell;
    public JButton reset;
    public GameController gc;

    public TowerPanel(Tower t, GameController gc){
        this.t = t;
        this.gc = gc;
        upgrade = new JButton("Upgrade");
        sell = new JButton("Sell");
        reset = new JButton("Reset");

        this.add(upgrade);
        this.add(sell);
        this.add(reset);

        upgrade.addActionListener(this);
        sell.addActionListener(this);
        reset.addActionListener(this);

        this.setPreferredSize(new Dimension(150, 600));
        this.setBackground(Color.BLACK);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == upgrade.getActionCommand()) {
            if (gc.getGame().getPlayer().getMoney() >= t.getPrice()) {
                t.upgrade();
                gc.getGame().getPlayer().changeMoney(-t.getPrice());
                gc.getGamePanel().getMainPanel().resetState();
            }
        }

        if (e.getActionCommand() == sell.getActionCommand()) {
            gc.getGame().getPlayer().removeTower(t);
            gc.getGame().getPlayer().changeMoney(t.getPrice()*3/5);
            gc.getGamePanel().getMainPanel().resetState();
        }

        if (e.getActionCommand() == reset.getActionCommand()) {
            gc.getGamePanel().getMainPanel().resetState();
        }

        System.out.println("Clicked Button");
    }
}
