package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShapeCalculator {
	public ShapeCalculator()
	{
		System.out.println("HI, NHR. Your apps Work properly.");
		int width=400, height=400, areA=60;
		JFrame frame1=new JFrame("Shape Calculator");
		frame1.setVisible(true);
		frame1.setSize(width, height);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel displayPnl=new JPanel();
		JPanel ctrlPnl=new JPanel();
		Container cp=frame1.getContentPane();
		
		final JLabel areaLbl= new JLabel("Area: "+areA);
		final JTextField typeTF=new JTextField("Square");
		JButton newbtn=new JButton("MakeBtn");
		
		//adding pnls
		cp.add(ctrlPnl, BorderLayout.NORTH);
		cp.add(displayPnl,BorderLayout.CENTER);
		cp.add(areaLbl,BorderLayout.SOUTH);
		
		ctrlPnl.add(typeTF);
		ctrlPnl.add(newbtn);
		
		newbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//System.out.println("Hello GUI World!");
				SquareFactory objec=new SquareFactory();
				areaLbl.setText( "Area : "+ objec.getArea(typeTF.getText()) );
				//SquareFactory
			}
		});
		
	}
}
