package controller;
import shapeCalc.ShapeCalc;

public class ShapeCalcController {
	String text="Hello";
	private ShapeCalc shapeCalc = new ShapeCalc("This is Shape Calculator");
	ShapeCalcController(){
		shapeCalc.validate();
		shapeCalc.setVisible(true);
	}

	public static void main(String[] args){
		System.out.println("ShapeCalcController Runned");
		new ShapeCalcController();
	}
}