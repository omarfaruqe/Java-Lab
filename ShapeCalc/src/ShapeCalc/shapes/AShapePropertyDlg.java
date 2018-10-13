package shapeCalc;

import java.awt.Container;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class AShapePropertyDlg extends JDialog
{
  	private static final long serialVersionUID = 1L;

public AShapePropertyDlg(JFrame owner, JPanel shapePropPanel)
  {
    super(owner, "Shape Properties", true);
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("Cancel");
    JPanel btnPanel = new JPanel();

    btnPanel.setLayout(new BoxLayout(btnPanel, 0));
    btnPanel.add(okButton);
    btnPanel.add(cancelButton);
    getContentPane().add(btnPanel, "South");
    getContentPane().add(shapePropPanel, "Center");

    okButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        AShapePropertyDlg.this.okBtnClick(e);
      }
    });
    cancelButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        AShapePropertyDlg.this.cancelBtnClick(e);
      }
    });
    pack();
    setLocationRelativeTo(null);
  }

  protected abstract void okBtnClick(ActionEvent paramActionEvent);

  protected abstract void cancelBtnClick(ActionEvent paramActionEvent);
}
