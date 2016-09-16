package com.company.Game.Paths;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zacklee on 7/30/16.
 */
public abstract class Path {

    ArrayList<Point> points = new ArrayList<Point>();

    public Path(){

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
