/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboration1_wo_poly;

/**
 * @author Stefan
 * @author oleg
 */
public class Rektangel {
    private double sida1;
    private double sida2;

    public Rektangel(double s1, double s2) {
        this.sida1 = s1;
        this.sida2 = s2;

    }

    public double omkrets() {
        double omkrets = (sida1 + sida2);
        return omkrets;
    }

    public double area() {
        double area = (sida1 * sida2);
        return area;
    }

    public void getArea() {
        System.out.println("Arean är " + Program.round(2, area()) + " a.e.");
    }

    public void getOmkrets() {
        System.out.println("Omkretsen är " + Program.round(2, omkrets()) + " a.e.");
    }

    public double getSida2() {
        return sida2;
    }

    public void setSida2(double sida2) {
        this.sida2 = sida2;
    }

    public void setSida1(double sida1) {
        this.sida1 = sida1;
    }

    public double getSida1() {
        return sida1;
    }
}
