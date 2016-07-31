package com.company.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tylercai on 7/30/16.
 */
public class GamePanel extends JPanel{

    private MainPanel main;
    private Timer tm;

    public void start(){
        tm.start();
    }

    public void stop(){
        tm.stop();
    }

    public GamePanel(MainPanel main){
        this.main = main;
        this.setBackground(Color.GREEN);
        this.setSize(800, 600);
    }

}
