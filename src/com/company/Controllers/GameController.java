package com.company.Controllers;

import com.company.Game.Game;
import com.company.Game.Player;
import com.company.UI.GamePanel;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by tylercai on 7/30/16.
 */
public class GameController implements MouseListener, KeyListener{

    private GamePanel gp;
    private Game game;

    public GameController(GamePanel gp){
        this.gp = gp;
        game = new Game(gp);
    }

    public Game getGame(){
        return game;
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Building a tower");
        game.getPlayer().addTower(Player.ARCHER_TOWER, e.getX(), e.getY());
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Start Level");
        if(e.getKeyChar() == KeyEvent.VK_SPACE){
            game.startNextLevel();
        }
    }
}
