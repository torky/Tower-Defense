package com.company.Controllers;

import com.company.Game.Game;
import com.company.Game.Player;
import com.company.UI.Panels.GamePanel;

import java.awt.event.*;

/**
 * Created by tylercai on 7/30/16.
 */
public class GameController implements KeyListener, MouseListener{

    private GamePanel gp;
    private Game game;
    private int clickState = 0;

    public final static int NONE = 0;
    public final static int ARCHER_TOWER = 1;
    public final static int CANNON = 2;
    public final static int MAGE_TOWER = 3;
    public final static int SUPER_TOWER = 4;

    public GameController(GamePanel gp){
        this.gp = gp;
        game = new Game(gp);
        gp.addKeyListener(this);
    }

    public Game getGame(){
        return game;
    }

    public void setClickState(int state){
        clickState = state;
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON3){
            System.out.println("SecondMouse");
            clickState = NONE;

        }
        switch(clickState){
            case ARCHER_TOWER:
                game.getPlayer().addTower(Player.ARCHER_TOWER, e.getX(), e.getY());
                break;
            case CANNON:
                game.getPlayer().addTower(Player.CANNON, e.getX(), e.getY());
                break;
            case MAGE_TOWER:
                game.getPlayer().addTower(Player.MAGE_TOWER, e.getX(), e.getY());
                break;
            case SUPER_TOWER:
                game.getPlayer().addTower(Player.SUPER_TOWER, e.getX(), e.getY());
                break;
        }
        gp.repaint();
        clickState = NONE;



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
