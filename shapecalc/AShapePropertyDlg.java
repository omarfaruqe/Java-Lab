package shapecalc;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;

public abstract class AShapePropertyDlg extends JDialog{
	AShapePropertyDlg(JFrame owner, JPanel propPanel)
	{
		super(owner, "Shape Properties", true);
		JButton ok = new JButton("Ok");
		JButton cancel = new JButton("Cancel");
		
		JPanel btnPnl = new JPanel();
		btnPnl.setLayout(new BoxLayout(btnPnl, BoxLayout.X_AXIS));
		btnPnl.add(ok);
		btnPnl.add(cancel);
		
		getContentPane().add(btnPnl, BorderLayout.SOUTH);
		getContentPane().add(propPanel, BorderLayout.CENTER);
		
		pack(); //to force the panel to show up in an acceptable size
		setLocationRelativeTo(null); //show up in middle	
	}
	
	protected abstract void okBtnClick(ActionEvent e);
	protected abstract void cancelButtonClick(ActionEvent e);
}
