package shapes;

import java.awt.Graphics;

import shapeCalc.IShape;
import shapeCalc.IShapeFactory;

public class SquareFactory implements IShapeFactory {
	
	public IShape makeShape() {
		
		IShape ishape =new IShape() {
			
			private double length=5.0;
			
			public double getArea() {
				
				return length*length;
			}

			public void paint(Graphics g, int x, int y) {
				
				
			}
		};
		return ishape;
	}
}