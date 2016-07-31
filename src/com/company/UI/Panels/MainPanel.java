package com.company.UI.Panels;

import javax.swing.*;

/**
 * Created by tylercai on 7/30/16.
 */
public class MainPanel extends JPanel{

    private MenuPanel menu;
    private GamePanel game;

    private int state;

    public static final int MENU = 0, GAME = 1;

    public MainPanel(){
        state = MENU;
        menu = new MenuPanel(this);
        this.add(menu);
    }

    public void changeState(int newState){

        switch(state){
            case MENU:
                this.remove(menu);
                break;
            case GAME:
                this.remove(game);
                this.remove(game.getGameMenuPanel());
                break;
        }

        state = newState;

        switch(state){
            case MENU:
                this.add(menu);
                break;
            case GAME:
                game = new GamePanel(this);
                this.add(game);
                this.add(game.getGameMenuPanel());
                break;
        }

        repaint();
    }

}
