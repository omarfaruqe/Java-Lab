package shapecalc.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import shapecalc.IShape;
import shapecalc.IShapeFactory;

public class CircleFactory implements IShapeFactory {

	private CircleFactory()
	{
		CircleFactory.pnl.setLayout(new BoxLayout(CircleFactory.pnl, BoxLayout.Y_AXIS));
		CircleFactory.pnl.add(new JLabel("Radius"));
		CircleFactory.pnl.add(radiusTF);
		CircleFactory.pnl.add(new JLabel("Color"));
		JButton colorBtn = new JButton("Color"); 
		colorBtn.setBackground(CircleFactory._selectedColor);
		CircleFactory.pnl.add(colorBtn);
		colorBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				CircleFactory._selectedColor = JColorChooser.showDialog(pnl, "Choose a color", CircleFactory._selectedColor);
				colorBtn.setBackground(_selectedColor);
			}
		});

	}



	public IShape makeShape()
	{
		try 
		{
			IShape is = new IShape()
			{
				double radius = Double.parseDouble(radiusTF.getText());
				public double getArea()
				{
					return Math.PI * radius * radius;
				}

				public void paint(Graphics g, int x, int y)
				{
					Color oldColor = g.getColor();
					Color _color = CircleFactory._selectedColor;
					g.setColor(_color);
					g.fillOval(x - (int)radius / 2, y - (int)radius / 2, (int)radius, (int)radius);
					g.setColor(oldColor);
				}

			};
			return is;
		}
		catch(Exception parseError)
		{
			CircleFactory.radiusTF.setText("0.0");
			return this.makeShape();
		}
	}

	public JPanel getPropertyPanel() {
		return pnl;
	}

	private static Color _selectedColor = Color.BLUE;
	private static JPanel pnl = new JPanel();
	private static JTextField radiusTF = new JTextField("0.0");
	public static final CircleFactory Singleton = new CircleFactory();

}
