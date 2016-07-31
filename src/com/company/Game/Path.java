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

    public Point getPointAtIndex(int index){
        return points.get(index);
    }

    public int length(){
        return points.size();
    }

    public void draw(Graphics g){
        g.setColor(Color.MAGENTA);
        for(int i = 0; i < length()-1; i++){
            Point pStart = points.get(i);
            Point pEnd = points.get(i+1);
            g.drawLine(pStart.x, pStart.y, pEnd.x, pEnd.y);
        }
    }
}
