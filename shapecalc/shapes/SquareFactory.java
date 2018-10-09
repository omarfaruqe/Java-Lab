package shapecalc.shapes;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import shapecalc.IShape;
import shapecalc.IShapeFactory;


public class SquareFactory implements IShapeFactory 
{


	private SquareFactory()
	{
		SquareFactory.pnl.setLayout(new BoxLayout(SquareFactory.pnl, BoxLayout.Y_AXIS));
		SquareFactory.pnl.add(new JLabel("Length"));
		SquareFactory.pnl.add(SquareFactory.jtf);
	}

	public IShape makeShape()
	{
		String sLength = jtf.getText();
		try 
		{
			IShape is = new IShape()
			{
				double length = Double.parseDouble(sLength);
				public double getArea()
				{
					return length * length;
				}

				public void paint(Graphics g, int x, int y)
				{
					g.setColor(new Color(244, 0, 244));
					g.drawRect(x - (int)length / 2, y - (int)length / 2	, (int)length, (int)length);
				}

			};
			return is;
		}
		catch (Exception parseError) 
		{
			SquareFactory.jtf.setText("0.0");
			return this.makeShape();
		}
	}

	public JPanel getPropertyPanel() 
	{
		return SquareFactory.pnl;
	}
	
	private static JPanel pnl = new JPanel();
	private static JTextField jtf = new JTextField("10.0"); 
	public static final SquareFactory Singleton = new SquareFactory();

}
