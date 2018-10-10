package shapeCalc.shapes;

import java.awt.Container;
import java.awt.Graphics;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import shapeCalc.IShape;
import shapeCalc.IShapeFactory;

public class SquareFactory
  implements IShapeFactory
{
  private static JTextField _sideTF = new JTextField("0.0");
  private static JPanel _propPnl = new JPanel();

  public static final SquareFactory Singleton = new SquareFactory();

  private SquareFactory() { _propPnl.setLayout(new BoxLayout(_propPnl, 1));
    _propPnl.add(new JLabel("Side:"));
    _propPnl.add(_sideTF); }

  public JPanel getPropertyPanel()
  {
    return _propPnl;
  }

  public IShape makeShape()
  {
    try
    {
      return new IShape() {
        private double _side = Double.parseDouble(SquareFactory._sideTF.getText());

        public double getArea() {
          return this._side * this._side;
        }

        public void paint(Graphics g, int x, int y) {
          g.drawRect(x - (int)this._side / 2, y - (int)this._side / 2, (int)this._side, (int)this._side);
        }
      };
    }
    catch (Exception parseError) {
      _sideTF.setText("0.0");
    }return makeShape();
  }
}