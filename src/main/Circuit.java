package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Circuit {

	public static void main(String[] args) throws FileNotFoundException {
		  Scanner console = new Scanner(System.in);
	      System.out.println("Input file: ");
	      String inputFileName = console.next();
	      System.out.println("Output file: ");
	      String outputFileName = console.next();
	      
	      File inputFile = new File(inputFileName);
	      Scanner in = new Scanner(inputFile);
	      PrintWriter out = new PrintWriter(outputFileName);		  
	    while (in.hasNextDouble()) {
		      double B = in.nextDouble();
		      double R = in.nextDouble();
		      double C = in.nextDouble();
		      double start = in.nextDouble();
		      double end = in.nextDouble();;
		      double steps;
		      
		      steps = (end-start)/100;
		      
		      for(double i=start ; i<=end ; i+=steps) {
		    	  double V;
		    	  V = B*(1-Math.exp(i/(R*C)));
		    	  System.out.println(i + "  " + V);
		    	  out.printf("%llf %llf", i, V);
		      }
		     
	    }
	    out.close();
	    in.close();
	}

}
