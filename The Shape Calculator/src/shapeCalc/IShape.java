package shapeCalc;

import java.awt.Graphics;

public abstract interface IShape{
	  public abstract double getArea();
	
	  public abstract void paint(Graphics paramGraphics, int paramInt1, int paramInt2);

}