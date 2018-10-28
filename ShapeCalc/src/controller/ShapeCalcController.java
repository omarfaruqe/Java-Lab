package controller;

import shapeCal.ShapeCalc;

public class ShapeCalcController {
	
	ShapeCalc shapeCalc;
	public ShapeCalcController(String title) {
		// TODO Auto-generated constructor stub
		
		shapeCalc =new ShapeCalc(title);
		shapeCalc.validate();
		shapeCalc.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ShapeCalcController("Shape Calculator");
		

	}


}
