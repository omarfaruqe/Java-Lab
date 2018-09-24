package main;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Circuit {
	double B;
    double R;
    double C;

    Circuit(double b, double r, double c) {
        B = b;
        R = r;
        C = c;
    }

			public double v(double t) {
    		    return B * (1 - Math.exp((-t) / (R * C)));
    		}
            
}
public class CircuitMain {
	
	public static void main(String[] args){
     double B=0.0,R=0.0,C=0.0,ts=0.0,te=0.0,fr=0.0;
	    
         
        try {
    		File  input=new File("params.txt");
    		Scanner scanner = new Scanner(input);
             while(scanner.hasNext()) {
            	 B=scanner.nextDouble();
            	 R=scanner.nextDouble();
            	 C=scanner.nextDouble();
            	 ts=scanner.nextDouble();
            	 te=scanner.nextDouble();
            	 System.out.println(B+" "+R+" "+C+" "+ts+" "+te);
            	 scanner.close(); 	
             }    
    	}
    		catch(Exception e) {
    			 System.out.println(e);
    		}
       fr=(te-ts)/100;
       try {
        PrintWriter out = new PrintWriter("rc.txt");
        Circuit volt = new Circuit(B, R, C);
        double m;
        for (int i = 0; i < 100; i++) {
           m=volt.v(fr * (i + 1));
            out.println("v(" + fr * (i + 1) + ") = " +m);
        }
        out.close();
       }
        catch(Exception e) {
			 System.out.println(e);
		}
       
      
       
	}
}

