package com.company.UI.Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tylercai on 7/30/16.
 */
public class MenuPanel extends JPanel implements ActionListener{

    private MainPanel main;
    private JButton gameButton;

    public MenuPanel(MainPanel main){
        this.main = main;
        this.setBackground(Color.BLUE);

        gameButton = new JButton("Start Game");
        gameButton.setActionCommand("ChangeState");
        gameButton.setMnemonic('g');
        gameButton.addActionListener(this);

        this.add(gameButton);
        this.setFocusable(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == gameButton.getActionCommand()){
            main.changeState(MainPanel.GAME);
            System.out.println("Button Pressed");
        }
        System.out.println("Test");
    }
}
