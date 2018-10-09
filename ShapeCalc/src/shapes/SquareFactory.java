package shapes;

import java.awt.Graphics;

import shapeCalc.IShape;
import shapeCalc.IShapeFactory;

public class SquareFactory implements IShapeFactory {
	
	static SquareFactory obj = new SquareFactory();
	
	private SquareFactory() {}
	
	public IShape makeShape() {
		
		IShape ishape =new IShape() {
			
			private double length=100.0;
			
			public double getArea() {
				
				return length*length;
			}

			public void paint(Graphics g, int x, int y) {
				
				g.drawRect(x,y,(int)length,(int)length);
				//System.out.println("Bujhtesina");
			}
		};
		return ishape;
	}
	
	public static SquareFactory get() {
		
		return obj;
	}

}