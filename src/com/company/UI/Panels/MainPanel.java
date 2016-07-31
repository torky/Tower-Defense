package com.company.UI.Panels;

import com.company.UI.Window;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tylercai on 7/30/16.
 */
public class MainPanel extends JPanel{

    private MenuPanel menu;
    private GamePanel game;
    private Window window;

    private int state;

    public static final int MENU = 0, GAME = 1;

    public MainPanel(Window w){
        state = MENU;
        window = w;
        menu = new MenuPanel(this);
        this.add(menu);
        this.setPreferredSize(new Dimension(800, 600));
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
                game.setVisible(true);
                game.getGameMenuPanel().setVisible(true);
                window.pack();;
                break;
        }

        repaint();
    }

}
