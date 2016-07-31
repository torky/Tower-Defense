package com.company.Controllers;

import com.company.Game.Player;
import com.company.UI.GamePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by tylercai on 7/30/16.
 */
public class GameController implements ActionListener, MouseListener{

    Timer tm = new Timer(50, this);
    private GamePanel gp;

    public GameController(GamePanel gp){
        this.gp = gp;

    }

    public void start(){
        tm.start();
    }

    public void stop(){
        tm.stop();
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}
