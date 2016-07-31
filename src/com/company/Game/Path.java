package com.company.Game;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zackli on 7/30/16.
 */
public class Path {

    ArrayList<Point> points = new ArrayList<Point>();

    public Path(){
        Point start = new Point(0, 100);
        Point end = new Point(700, 100);

        points.add(start);
        points.add(end);
    }
}
