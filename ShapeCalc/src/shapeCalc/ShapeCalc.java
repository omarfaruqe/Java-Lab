package shapeCalc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
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
		// TODO Auto-generated constructor stub
		
	}

	@Override
	protected void initialize() {
		final JTextField typeTF = new JTextField("Square");
		JPanel ctrlPnl = new JPanel();
		JButton newBtn = new JButton("New...");
		JPanel displayPnl = new JPanel();
		final JLabel areaLbl = new JLabel("Area:");;
		ctrlPnl.add(typeTF);
		ctrlPnl.add(newBtn);
		Container cp = getContentPane();
		cp.add(ctrlPnl, BorderLayout.NORTH);
		cp.add(displayPnl, BorderLayout.CENTER);
		cp.add(areaLbl, BorderLayout.SOUTH);
		
		newBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				
				SquareFactory sF=new SquareFactory();
				areaLbl.setText("Area: "+Double.toString(sF.makeShape().getArea()));
				
				
//				String text = typeTF.getText();
//				areaLbl.setText(text);
				
			}
			
		});
		
		setSize(400, 400); 
		setLocationRelativeTo(null);
		
	}

}