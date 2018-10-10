package shapecalc;

public class ShapeCalcController {
	private ShapeCalc _shapeCalc;
	public ShapeCalcController() {
		this._shapeCalc = new ShapeCalc("Shape Calculator");
		this._shapeCalc.validate();
		this._shapeCalc.setVisible(true);
	}
	public static void main(String[] args)
	{
	   new ShapeCalcController();
	}
}
