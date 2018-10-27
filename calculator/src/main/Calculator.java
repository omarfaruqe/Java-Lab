package main;

import java.awt.Color;

import javax.swing.*;

public class Calculator{

	private JTextArea txt;
	private JFrame frame;
	private JPanel panel;
	private JButton[] btn = new JButton[10];
	private JButton[] btnex = new JButton[10];
	
	public void design() {
		
		frame = new JFrame("Calculator");
		frame.setSize(335, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setLayout(null);
		
		txt = new JTextArea();
		txt.setText("");
		txt.setBounds(10, 20, 310, 100);
		panel.add(txt);
		
		btnex[1] = new JButton("(");
		btnex[1].setBounds(10, 150, 70, 40);
		panel.add(btnex[1]);
		
		btnex[2] = new JButton(")");
		btnex[2].setBounds(90, 150, 70, 40);
		panel.add(btnex[2]);
		
		btnex[3] = new JButton("sq");
		btnex[3].setBounds(170, 150, 70, 40);
		panel.add(btnex[3]);
		
		btnex[4] = new JButton("del");
		btnex[4].setBounds(250, 150, 70, 40);
		panel.add(btnex[4]);
		
		btn[7] = new JButton("7");
		btn[7].setBounds(10, 200, 70, 40);
		panel.add(btn[7]);
		
		btn[8] = new JButton("8");
		btn[8].setBounds(90, 200, 70, 40);
		panel.add(btn[8]);
		
		btn[9] = new JButton("9");
		btn[9].setBounds(170, 200, 70, 40);
		panel.add(btn[9]);
		
		btnex[5] = new JButton("/");
		btnex[5].setBounds(250, 200, 70, 40);
		panel.add(btnex[5]);
		
		
		btn[4] = new JButton("4");
		btn[4].setBounds(10, 250, 70, 40);
		panel.add(btn[4]);
		
		btn[5] = new JButton("5");
		btn[5].setBounds(90, 250, 70, 40);
		panel.add(btn[5]);
		
		btn[6] = new JButton("6");
		btn[6].setBounds(170, 250, 70, 40);
		panel.add(btn[6]);
		
		btnex[5] = new JButton("x");
		btnex[5].setBounds(250, 250, 70, 40);
		panel.add(btnex[5]);
		
		btn[1] = new JButton("1");
		btn[1].setBounds(10, 300, 70, 40);
		panel.add(btn[1]);
		
		btn[2] = new JButton("2");
		btn[2].setBounds(90, 300, 70, 40);
		panel.add(btn[2]);
		
		btn[3] = new JButton("3");
		btn[3].setBounds(170, 300, 70, 40);
		panel.add(btn[3]);
		
		btnex[6] = new JButton("-");
		btnex[6].setBounds(250, 300, 70, 40);
		panel.add(btnex[6]);
		
		btn[0] = new JButton("0");
		btn[0].setBounds(90, 350, 70, 40);
		panel.add(btn[0]);
		
		btnex[7] = new JButton(".");
		btnex[7].setBounds(10, 350, 70, 40);
		panel.add(btnex[7]);
		
		btnex[8] = new JButton("=");
		btnex[8].setBounds(170, 350, 70, 40);
		panel.add(btnex[8]);
		
		btnex[9] = new JButton("+");
		btnex[9].setBounds(250, 350, 70, 40);
		panel.add(btnex[9]);
		
		frame.add(panel);
		frame.setVisible(true);
	}

}
