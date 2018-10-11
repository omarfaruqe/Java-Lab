package shapeCalc;

import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public abstract class AFrame extends JFrame
{
  public AFrame(String title)
  {
    super(title);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    initialize();
  }

  protected abstract void initialize();
}
