package com.company.UI.Buttons;

import com.company.Controllers.GameController;
import com.company.Game.Towers.Tower;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tylercai on 7/31/16.
 */
public class TowerButton extends JButton implements ActionListener{

    private int towerType;
    private GameController gc;

    public TowerButton(String name, int towerType, GameController gc){
        super(name);
        this.gc = gc;
        this.towerType = towerType;
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == this.getActionCommand()){
            gc.setClickState(towerType);
        }
    }
}
