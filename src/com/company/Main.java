package com.company;

import com.company.UI.Panels.MainPanel;
import com.company.UI.Window;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Program Start");

        Window w = new Window();
        MainPanel m = new MainPanel();
        w.add(m);
        w.pack();
        w.setSize(800, 600);
        w.setResizable(false);
        w.repaint();
    }
}
