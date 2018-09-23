package main;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        double B = 0.0;
        double R = 0.0;
        double C = 0.0;
        if (args.length > 1) {
            System.out.println("Command format is not valid.\nValid format is java program_name file_name");
        } else {
            final int D = 150;
            final double STEP = 100;
            double[] v = new double[D];
            double tStart = 0.0;
            double tEnd = 0.0;
            try {
                Scanner input = new Scanner(new File(args[0]));
                B = input.nextDouble();
                R = input.nextDouble();
                C = input.nextDouble();
                tStart = input.nextDouble();
                tEnd = input.nextDouble();
                // System.out.println(B + " " + R + " " + C + " " + tStart + " " + tEnd);
                input.close();
            } catch (FileNotFoundException f) {
                System.out.println("File not Find");
            }
            PrintWriter out = new PrintWriter("rc.txt");
            Circuit volt = new Circuit(B, R, C);
            double fr = (tEnd - tStart) / STEP;
            for (int i = 0; i < 100; i++) {
                v[i] = volt.v(fr * (i + 1));
                // System.out.println(v[i]);
                out.println("v(" + fr * (i + 1) + ") = " + v[i]);
            }
            out.close();
        }
    }
}
