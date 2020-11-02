/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TriangleObjets;

import java.util.Scanner;

/**
 *
 * @author Kunal
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side1 of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side2 of the triangle: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side3 of the triangle: ");
        double side3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter color of triangle: ");
        String color = scanner.nextLine();
        System.out.println("Is the triangle filled with color?"
                + " (answer in true or false only): ");
        boolean isFilled = scanner.nextBoolean();

        Triangle t1 = new Triangle(isFilled, color, side1, side2, side3);

        System.out.println(t1.toString());
    }

}
