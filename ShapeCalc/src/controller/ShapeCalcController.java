package controller;

import shapeCalc.ShapeCalc;

public class ShapeCalcController {
	
	ShapeCalc shapeCalc;
	
	public ShapeCalcController(String title) {
		
		shapeCalc =new ShapeCalc(title);
		shapeCalc.validate();
		shapeCalc.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new ShapeCalcController("Shape Calculator");	
	}

}
