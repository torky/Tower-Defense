package com.company;

import com.company.UI.Panels.MainPanel;
import com.company.UI.Window;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Program Start");

        Window w = new Window();

        MainPanel m = new MainPanel(w);
        w.setContentPane(m);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
        w.pack();

        w.repaint();
    }
}
