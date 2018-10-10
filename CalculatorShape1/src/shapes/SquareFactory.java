package shapes;
import java.awt.Graphics;

import shapecalc.IShape;
import shapecalc.IShapeFactory;

public class SquareFactory implements IShapeFactory {

	@Override
	public IShape makeShape() {
		try {
			return new IShape() {
				private double _side = 34.54;
				@Override
				public void paint(Graphics g, int x, int y) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public double getArea() {
					// TODO Auto-generated method stub
					return this._side * this._side;
				}
			};
		}
		catch(Exception parseError){
			
		}
		return makeShape();
	}
}
