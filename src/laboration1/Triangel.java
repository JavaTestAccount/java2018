/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboration1;

/**
 * @author Stefan
 * @author oleg
 */
public class Triangel extends Figur {

    private double bas;
    private double höjd;
    private double sida;

    public Triangel(double b, double h, double s) {
        this.bas = b;
        this.höjd = h;
        this.sida = s;
    }

    public double area() {
        double area = (bas * höjd) / 2;
        return area;
    }

    public double omkrets() {
        double omkrets = (bas + höjd + sida);
        return omkrets;
    }

    public void getOmkrets() {
        System.out.println("Omkretsen är " + Program.round(2, omkrets()) + " a.e.");
    }

    public void getArea() {
        System.out.println("Arean är " + Program.round(2, area()) + " a.e.");
    }

    public void setSida(double sida) {
        this.sida = sida;
    }

    public double getSida() {
        return sida;
    }

    public void setBas(double bas) {
        this.bas = bas;
    }

    public void setHöjd(double höjd) {
        this.höjd = höjd;
    }

    public double getHöjd() {
        return höjd;
    }

    public double getBas() {
        return bas;
    }

}
