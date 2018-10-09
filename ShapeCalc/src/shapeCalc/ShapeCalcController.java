package shapeCalc;

public class ShapeCalcController
{
	ShapeCalcController()
	{
		ShapeCalc shapecalc = new ShapeCalc("Shape Calculator");
		shapecalc.validate();
		shapecalc.setVisible(true);
	}

	public static void main(String[] args)
	{
		new ShapeCalcController();
	}
}
