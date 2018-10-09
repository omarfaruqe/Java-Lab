package shapecalc;

import shapecalc.shapes.SquareFactory;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;

import javax.swing.*;

public class ShapeCalc extends AFrame
{
	public ShapeCalc(String title)
	{
		super(title);
	}
	
	protected void initialize()
	{
		SquareFactory sf = new  SquareFactory();
		setSize(400, 400); // set size to 400x400 pixels
		setLocationRelativeTo(null); //center frame on the screen
		
		final JPanel ctrlPnl = new JPanel();
		final JPanel displayPnl = new JPanel();
		JLabel areaLbl = new JLabel("Area:");
		
		Container cp = getContentPane();
		cp.add(ctrlPnl, BorderLayout.NORTH);
		cp.add(displayPnl, BorderLayout.CENTER);
		cp.add(areaLbl, BorderLayout.SOUTH);
		
		JTextField typeTF = new JTextField("Square"); 
		JButton newBtn = new JButton("New...");
		ctrlPnl.add(typeTF);
		ctrlPnl.add(newBtn);
		newBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Calling actionPerformed");
				//areaLbl.setText(typeTF.getText());
				
				IShape is = SquareFactory.Singleton.makeShape();
				areaLbl.setText("Area: " + is.getArea());
			}
		});
	}
}
