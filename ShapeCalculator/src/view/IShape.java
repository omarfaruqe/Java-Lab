package view;

import java.awt.*;   // needed for Graphics class

public interface IShape {

    public abstract double getArea();

    public abstract void paint(Graphics g, int x, int y);

}

