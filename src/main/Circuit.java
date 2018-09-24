package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Exception;
import java.util.Scanner;

public class Circuit {
	public static void main(String[] args) throws Exception
	{
		File file = new File("C:\\Users\\wvcc\\Desktop\\LabTest1\\src\\main\\params.txt"); 
		Scanner sc = new Scanner(file); 
			  
		if (sc.hasNextDouble()) {
			
			double t1 = sc.nextInt();
            double tn = sc.nextInt();
            
            double B = sc.nextDouble();
			double R = sc.nextDouble();
			double C = sc.nextDouble();
			
			double e = 2.7183;
			double rc = 1/(R*C);
			
			double T = (tn-t1)/100;
			for(double i = t1; i<=tn; i=i+T) {
				double ep = 1 / (Math.pow(e, (rc*i)));
				double v = B*(1-ep);
				
				File fileName = new  File("C:\\Users\\wvcc\\Desktop\\LabTest1\\src\\main\\rc.txt");
			    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
			    writer.append("\n"+i+"  "+v);
			    
			    writer.close();
				
				
			}
		}	      
	}
}
