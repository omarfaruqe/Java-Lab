package shapeCalc;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class ShapeCalc extends AFrame{

	public ShapeCalc(String title) {
		super(title);
	}
	@Override
	protected void initialize() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		JPanel ctrlPnl = new JPanel();
		JPanel displayPnl = new JPanel();
		JLabel areaLbl = new JLabel("Area: ");
		Container cp;
		cp = (Container) getContentPane().add(areaLbl);
		add(ctrlPnl, BorderLayout.NORTH);
		add(displayPnl, BorderLayout.CENTER);
		add(areaLbl, BorderLayout.SOUTH);
		JTextField typeTF = new JTextField("Square");
		JButton newBtn = new JButton("new...");
		ctrlPnl.add(typeTF);
		ctrlPnl.add(newBtn);
	}
}
