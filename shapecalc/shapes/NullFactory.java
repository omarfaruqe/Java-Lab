package shapecalc.shapes;
import java.awt.Graphics;

import javax.swing.JPanel;

import shapecalc.IShape;
import shapecalc.IShapeFactory;


public class NullFactory implements IShapeFactory 
{
	public static final NullFactory Singleton = new NullFactory();
	private static JPanel pnl = new JPanel();
		
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

	public JPanel getPropertyPanel() {
		return pnl;
	}
}
