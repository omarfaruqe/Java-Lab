package shapecalc.shapes;
import java.awt.Graphics;

import shapecalc.IShape;
import shapecalc.IShapeFactory;


public class NullFactory implements IShapeFactory 
{
	public static final NullFactory Singleton = new NullFactory();
	
//	private static NullFactory uniqueInstance;
//	public NullFactory() 
//	{
//		
//	}
//	
//	public static NullFactory getInstance() 
//	{
//		if(uniqueInstance == null) {
//			uniqueInstance = new NullFactory();
//		}
//		return uniqueInstance;
//	}
//	
	
	public IShape makeShape()
	{
		IShape is = new IShape()
				{
					double length = 0.f;
					public double getArea()
					{
						return 0.f;
					}
					
					public void paint(Graphics g, int x, int y)
					{
						
					}
			
				};
		return is;
	}
}
