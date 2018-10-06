package shapecalc;

import java.awt.Graphics;

public interface IShape {
	public abstract double getArea();
    public abstract void paint(Graphics g, int x, int y);
}
