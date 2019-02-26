package shapes;

import java.awt.Graphics;

import shapeCalc.IShape;
import shapeCalc.IShapeFactory;

public class SquareFactory implements IShapeFactory {
	
	@Override
	public IShape makeShape() {
		IShape ishape =new IShape() {
			private double length=5.0;
			@Override
			public double getArea() {
				
				return length*length;
			}

			@Override
			public void paint(Graphics g, int x, int y) {
				
				
			}
			
		};
		return ishape;
		
	}//page 11 singleton bujhini.

}