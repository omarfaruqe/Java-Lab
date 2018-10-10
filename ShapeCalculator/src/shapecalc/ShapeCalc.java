package shapecalc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import shapes.SquareFactory;

public class ShapeCalc extends AFrame {
	public ShapeCalc(String title) {
		super(title);
	}
	protected void initialize() {
		setSize(400,400);
		setLocationRelativeTo(null);
		JPanel ctrlPnl = new JPanel();
		JPanel displayPnl = new JPanel();
		JLabel areaLbl = new JLabel("Area: ");
		JTextField shapeTF = new JTextField("Square");
	    JButton newBtn = new JButton("New...");

		
		Container cp = getContentPane();
		cp.add(ctrlPnl, BorderLayout.NORTH);
		cp.add(displayPnl,BorderLayout.CENTER);
		cp.add(areaLbl,BorderLayout.SOUTH);
		ctrlPnl.add(shapeTF);
	    ctrlPnl.add(newBtn);
	    
	    newBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				IShapeFactory sf = new SquareFactory();
				areaLbl.setText("Area: " + sf.makeShape().getArea());
			}
		});
		
	}
}
