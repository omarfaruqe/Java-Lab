package shapecalc.shapes;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import shapecalc.IShape;
import shapecalc.IShapeFactory;


public class SquareFactory implements IShapeFactory 
{
	public static final SquareFactory Singleton = new SquareFactory();
	private static JPanel pnl = new JPanel();
	
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
						g.setColor(new Color(244, 0, 244));
						g.drawRect(x - (int)length, y - (int)length, (int)length, (int)length);
					}
			
				};
		return is;
	}

	public JPanel getPropertyPanel() {
		return pnl;
	}
}
