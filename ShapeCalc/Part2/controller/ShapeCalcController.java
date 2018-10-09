package controller;
import shapeCalc.ShapeCalc;
import shapeCalc.shapes.SquareFactory;

public class ShapeCalcController {
	String text="Hello";
	private ShapeCalc shapeCalc = new ShapeCalc("This is Shape Calculator");
	ShapeCalcController(){
		shapeCalc.validate();
		shapeCalc.setVisible(true);
	}

	public static void main(String[] args){
		new ShapeCalcController();
		new SquareFactory();
	}
}