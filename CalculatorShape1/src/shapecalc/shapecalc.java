package shapecalc;

import shapecalc.shapes.NullFactory;
import shapecalc.shapes.SquareFactory;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.*;
import java.lang.reflect.*;

import javax.swing.*;

public class shapecalc extends AFrame
{
	public shapecalc(String title)
	{
		super(title);
	}

	protected void initialize()
	{
		setSize(400, 400); // set size to 400x400 pixels
		setLocationRelativeTo(null); //center frame on the screen

		//isf = new  SquareFactory();
		isf = (IShapeFactory) new NullFactory();
		is = isf.makeShape();

		JPanel ctrlPnl = new JPanel();
		JPanel displayPnl = new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				is.paint(g, getWidth() / 2, getHeight() / 2);

			}
		};
		JLabel areaLbl = new JLabel("Area:");

		Container cp = getContentPane();
		cp.add(ctrlPnl, BorderLayout.NORTH);
		cp.add(displayPnl, BorderLayout.CENTER);
		cp.add(areaLbl, BorderLayout.SOUTH);

		JTextField typeTF = new JTextField("shapecalc.shapes.SquareFactory"); 
		JButton newBtn = new JButton("New...");
		ctrlPnl.add(typeTF);
		ctrlPnl.add(newBtn);
		newBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IShapeFactory tisf = getFactory(typeTF.getText());
				new AShapePropertyDlg(shapecalc.this, tisf.getPropertyPanel()) 
				{
					@Override
					protected void okBtnClick(ActionEvent e) 
					{
						is = tisf.makeShape();
						
						areaLbl.setText("Area: " + is.getArea());
						displayPnl.repaint();
						this.dispose();
						
					}

					@Override
					protected void cancelBtnClick(ActionEvent e) 
					{
						this.dispose();
					}
					
				}.setVisible(true);
			}
		});
	}

	/**
	 * Look for the Singleton field in the given class name.
	 *
	 * @param shapeName a String that is the full classname of the desired
	class
	 * @return an IShapeFactory
	 */
	private IShapeFactory getFactory(String shapeName) {

		// There may be errors encountered so try the following code
		try {
			// Find the specified class and find the Singleton field in it.
			Field f = Class.forName(shapeName).getField("Singleton");
			// Return the static value of the Singleton field
			return (IShapeFactory)f.get(null);
		}
		// Do the following code only if an error was &quot;caught&quot;
		catch (Exception e) {
			System.err.println(e); // Print the error that occurred
			return null; // return value when error occurred
		}
	}

	private IShapeFactory isf;
	private IShape is;
}
