package main;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.Scanner;


public class Circuit {
	 public static void main(String arg[])
	    {
	        try {
	            FileReader input=new FileReader("params.txt");
	            Scanner scan=new Scanner(input);
	            PrintWriter write=new PrintWriter("rc.txt");
	            double B,R,C,voltage;
	            int t1,t2,step;
	            B=scan.nextDouble();
	            C=scan.nextDouble();
	            R=scan.nextDouble();
	            t1=scan.nextInt();
	            t2=scan.nextInt();
	            step=(t2-t1)/100;
	            for(int i=0;i<100;i++)
	            {
	                voltage=B*(1-Math.exp(-step/(R*C)));
	                write.print(step);
	                write.print("    ");
	                write.println(voltage);
	                step=step+10;
	            }
	            write.close();
	            scan.close();
	        } 
	        catch (IOException x) {
	           // System.err.format("IOException: %s%n", x);
	        }
	    }
	

}
