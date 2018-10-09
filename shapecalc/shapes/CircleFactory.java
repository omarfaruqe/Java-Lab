package shapecalc.shapes;

import java.awt.Color;
import java.awt.Graphics;

import shapecalc.IShape;
import shapecalc.IShapeFactory;

public class CircleFactory implements IShapeFactory {
	public static final CircleFactory Singleton = new CircleFactory();
	private static Color _selectedColor = Color.BLUE;
	
	public IShape makeShape()
	{
		IShape is = new IShape()
				{
					double radius = 50.f;
					public double getArea()
					{
						return Math.PI * radius * radius;
					}
					
					public void paint(Graphics g, int x, int y)
					{
						Color oldColor = g.getColor();
						Color _color = CircleFactory._selectedColor;
						g.setColor(_color);
						g.fillOval(x - (int)radius, y - (int)radius, (int)radius, (int)radius);
						g.setColor(oldColor);
					}
			
				};
		return is;
	}
}
