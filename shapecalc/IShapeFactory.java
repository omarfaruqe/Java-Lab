package shapecalc;

import javax.swing.JPanel;

public interface IShapeFactory 
{
	public abstract IShape makeShape();
	
	public abstract JPanel getPropertyPanel();
}
