package shapeCalc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ShapeCalc extends AFrame{
	private JLabel areaLbl;
	private JTextField typeTF;
	String text;

	public ShapeCalc(String title) {
		super(title);
	}
	@Override
	protected void initialize() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		JPanel ctrlPnl = new JPanel();
		JPanel displayPnl = new JPanel();
		
		areaLbl = new JLabel("Area: ");
		
		typeTF = new JTextField("Square");
		JButton newBtn = new JButton("new...");
		text = areaLbl.getText();
		areaLbl.setText(text);
		Container cp;
		cp = (Container) getContentPane().add(areaLbl);
		add(ctrlPnl, BorderLayout.NORTH);
		add(displayPnl, BorderLayout.CENTER);
		add(areaLbl, BorderLayout.SOUTH);
		ctrlPnl.add(typeTF);
		ctrlPnl.add(newBtn);
		ActionListener listener = new AddActionListener();
		newBtn.addActionListener(listener);
	}
	class AddActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			System.out.println("ActionListener Called and ActionPerformed");
			areaLbl.setText(text+typeTF.getText());
		}
	}
}
