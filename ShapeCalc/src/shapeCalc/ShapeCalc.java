package shapeCalc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import shapes.SquareFactory;

public class ShapeCalc  extends AFrame {

	public ShapeCalc(String title) {
		
		super(title);	
	}
	
	protected void initialize() {
		
		final JTextField typeTF = new JTextField("Square");
		JButton newBtn = new JButton("New..");
		
		JPanel ctrlPnl = new JPanel();
		final JLabel areaLbl = new JLabel("Area:"); 
		
		JPanel displayPnl = new JPanel() {
		
			public void paintComponent(Graphics g) {
				
				super.paintComponent(g);
		
				SquareFactory.get().makeShape().paint(g,130,90);
				
				//System.out.println("Print hoyse");
			}
		};
		
		
		
		Container cp = getContentPane();
		
		ctrlPnl.add(typeTF);
		ctrlPnl.add(newBtn);
		
		cp.add(ctrlPnl, BorderLayout.NORTH);
		cp.add(displayPnl, BorderLayout.CENTER);
		cp.add(areaLbl, BorderLayout.SOUTH);
		
		newBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				
				SquareFactory sq = SquareFactory.get();
				
				String text = "Area: " + Double.toString(sq.makeShape().getArea());
				areaLbl.setText(text);
				//System.out.println("Print hoyse");
				
			}
			
		});
		
		setSize(400, 400); 
		setLocationRelativeTo(null);
	}
}
