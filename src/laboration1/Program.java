/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboration1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Stefan
 * @author Oleg
 */
public class Program {

    private static int val;
    private static double längden;
    private static boolean noError = false;
    private static Figur figur;
    private static Scanner sc = new Scanner(System.in);

    public static void programMetod() {
        System.out.println("Vilken figur vill du skapa? \n1. Cirkel\n2. Triangel\n3. Rektangel");

        tryBetween(val, 1, 3);

        switch (val) {
            case 1:
                figur = new Cirkel(0);
                System.out.println("Du har valt cirkel");
                System.out.print("Skriv radie:");
                positivTal(längden);
                figur.setRadie(längden);
                break;

            case 2:
                figur = new Triangel(0, 0, 0);
                System.out.println("Du har valt triangel");
                System.out.print("Skriv bas:");
                positivTal(längden);
                figur.setBas(längden);
                System.out.print("Skriv höjd:");
                positivTal(längden);
                figur.setHöjd(längden);
                System.out.print("Skriv sista sida:");
                positivTal(längden);
                figur.setSida(längden);
                break;

            case 3:
                figur = new Rektangel(0, 0);
                System.out.println("Du har valt rektangel");
                System.out.print("Skriv första sidan:");
                positivTal(längden);
                figur.setSida1(längden);
                System.out.print("Skriv andra sidan:");
                positivTal(längden);
                figur.setSida2(längden);
                break;
        }
        System.out.println("Vad vill du göra? \n1. Beräkna area\n2. Beräkna omkrets\n3. Beräkna båda");
        tryBetween(val, 1, 3);

        switch (val) {
            case 1:
                figur.getArea();
                break;
            case 2:
                figur.getOmkrets();
                break;
            case 3:
                figur.getOmkrets();
                figur.getArea();
                break;
        }

        System.out.println("Vill du fortsätta eller sluta? \n1. Fortsätta\n2. Sluta");
        tryBetween(val, 1, 2);
        switch (val) {
            case 1:
                Program.programMetod();
            case 2:
                System.exit(0);

        }
    }

    /**
     * Gör skanner genom InputMismatchException + tillåter att använda längden
     * mellan a och b
     *
     * @param x variable
     * @param a är minsta längden
     * @param b är största längden
     */
    public static void tryBetween(int x, int a, int b) {
        noError = false;
        while (!noError) {

            try {
                x = sc.nextInt();
                noError = true;
                if (x < a || x > b) {
                    System.out.println("Skriv ett positiv tal mellan " + a + " och " + b);
                    noError = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Skriv ett positiv tal mellan " + a + " och " + b);
                sc.nextLine();

            }
        }
        val = x;
    }

    /**
     * Tillåter att använda bara ett positiv längden
     *
     * @param x
     */
    public static void positivTal(double x) {
        noError = false;
        while (!noError) {
            try {
                x = sc.nextDouble();
                noError = true;
                if (x < 0) {
                    System.out.println("Skriv ett positiv tal");
                    noError = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Skriv ett positiv tal");
                sc.nextLine();

            }
        }
        längden = x;
    }

    public static String round(int a, double b) {
        return String.format("%." + Integer.toString(a) + "f", b);
    }
}
