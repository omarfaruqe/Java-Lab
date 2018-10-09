package shapecalc;

public class ShapeCalcController 
{
	ShapeCalcController()
	{
		ShapeCalc sc = new ShapeCalc("Shape Calculator");
		sc.validate();
		sc.setVisible(true);
	}
	public static void main(String[] args) 
	{
		ShapeCalcController scc = new ShapeCalcController();
	}

}
