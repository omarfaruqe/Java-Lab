package shape;

import java.awt.Graphics;

import shapeCal.IShape;
import shapeCal.IShapeFactory;

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
		
	}

}
