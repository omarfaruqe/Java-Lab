package shapeCalc;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShapeCalc  extends AFrame {

	public ShapeCalc(String title) {
		
		super(title);	
	}
	
	protected void initialize() {
		
		JTextField typeTF = new JTextField("Square");
		JButton newBtn = new JButton("New..");
		
		JPanel ctrlPnl = new JPanel();
		JPanel displayPnl = new JPanel();
		JLabel areaLbl = new JLabel("Area:"); 
		
		Container cp = getContentPane();
		
		ctrlPnl.add(typeTF);
		ctrlPnl.add(newBtn);
		
		cp.add(ctrlPnl, BorderLayout.NORTH);
		cp.add(displayPnl, BorderLayout.CENTER);
		cp.add(areaLbl, BorderLayout.SOUTH);
		
		setSize(400, 400); 
		setLocationRelativeTo(null);
	}
}
