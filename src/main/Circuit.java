package main;

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
