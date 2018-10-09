package shapeCalc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShapeCalc extends AFrame
{

	public ShapeCalc(String title) 
	{
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initialize()
	{
		setSize(400, 400);
		setLocationRelativeTo(null);
		JPanel ctrlPnl = new JPanel();
		JPanel displayPnl = new JPanel();
		JLabel areaLbl = new JLabel("Area: ");
		
		Container cp = getContentPane();
		cp.add(ctrlPnl, BorderLayout.NORTH);
		cp.add(displayPnl, BorderLayout.CENTER);
		cp.add(areaLbl, BorderLayout.SOUTH);
		
		JTextField typeTF = new JTextField("Square");
		JButton newBtn = new JButton("New ...");
		
		ctrlPnl.add(typeTF);
		ctrlPnl.add(newBtn);
		
		newBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				areaLbl.setText(typeTF.getText());
			}
		});
	}
	
}