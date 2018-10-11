package shapes;
import java.awt.Graphics;

import shapecalc.IShape;
import shapecalc.IShapeFactory;

public class SquareFactory implements IShapeFactory {

	public IShape makeShape() {
		try {
			return new IShape() {
				private double _side = 34.54;
				public void paint(Graphics g, int x, int y) {
					
				}
				
				public double getArea() {
					return this._side * this._side;
				}
			};
		}
		catch(Exception parseError){
		
		}
		return makeShape();
	}
}
