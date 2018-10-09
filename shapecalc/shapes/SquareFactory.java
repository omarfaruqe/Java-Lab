package shapecalc.shapes;
import java.awt.Graphics;

import shapecalc.IShape;
import shapecalc.IShapeFactory;


public class SquareFactory implements IShapeFactory 
{
	public static final SquareFactory Singleton = new SquareFactory();

	
	private SquareFactory()
	{

	}
	
	public IShape makeShape()
	{
		IShape is = new IShape()
				{
					double length = 10.f;
					public double getArea()
					{
						return length * length;
					}
					
					public void paint(Graphics g, int x, int y)
					{
						
					}
			
				};
		return is;
	}
}
