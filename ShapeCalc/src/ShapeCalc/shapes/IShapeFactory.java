package shapeCalc;

import javax.swing.JPanel;

public abstract interface IShapeFactory
{
  public abstract JPanel getPropertyPanel();

  public abstract IShape makeShape();
}
