package com.company.UI.Buttons;

import com.company.Controllers.GameController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zackli on 8/3/16.
 */
public class NextLevel extends JButton implements ActionListener{
    private GameController gc;
    public NextLevel(GameController gc){
        super("Next Level");
        this.gc=gc;
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == this.getActionCommand()){
            gc.getGame().startNextLevel();
        }
    }

}
