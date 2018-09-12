package laboration1_wo_poly;

import static java.lang.Math.PI;

/**
 * @author Stefan
 * @author oleg
 */
public class Cirkel {
    private double radie;

    public Cirkel(double r) {
        this.radie = r;
    }

    public double getRadie() {
        return radie;
    }

    public void setRadie(double radie) {
        this.radie = radie;
    }

    public double area() {
        double area = PI * radie * radie;
        return area;

    }

    public double omkrets() {
        double omkrets = 2 * radie * PI;
        return omkrets;
    }

    public void getOmkrets() {
        System.out.println("Omkretsen är " + Program.round(2, omkrets()) + " a.e.");
    }

    public void getArea() {
        System.out.println("Arean är " + Program.round(2, area()) + " a.e.");
    }
}
