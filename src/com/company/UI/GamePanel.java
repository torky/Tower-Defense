package com.company.UI;

import com.company.Controllers.GameController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tylercai on 7/30/16.
 */
public class GamePanel extends JPanel{

    private MainPanel main;
    private GameController gc;

    public void start(){
        gc.start();
    }

    public void stop(){
        gc.stop();
    }

    public GamePanel(MainPanel main){
        this.main = main;
        gc = new GameController(this);
        this.addMouseListener(gc);
        this.setBackground(Color.GREEN);
        this.setSize(800, 600);
    }

}
