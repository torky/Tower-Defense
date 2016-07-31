package com.company.Controllers;

import com.company.Game.Game;
import com.company.Game.Player;
import com.company.UI.GamePanel;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by tylercai on 7/30/16.
 */
public class GameController implements KeyListener, MouseListener{

    private GamePanel gp;
    private Game game;

    public GameController(GamePanel gp){
        this.gp = gp;
        game = new Game(gp);
        gp.addKeyListener(this);
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

        if(e.getButton() == MouseEvent.BUTTON3){
            System.out.println("SecondMouse");
            game.startNextLevel();
        }
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void keyTyped(KeyEvent e) {
        System.out.println("KeyTyped");
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("KeyPressed");
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Start Level");
        if(e.getKeyChar() == KeyEvent.VK_SPACE){
            game.startNextLevel();
        }
    }
}
