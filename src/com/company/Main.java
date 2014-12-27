package com.company;

import java.util.Scanner;

/**
 *  Tile Cost
 *
 *  @author Raphael Miller (gemini88mill)
 *
 *  Find Cost of Tile to Cover W x H Floor –
 *  Calculate the total cost of tile it would take to cover a floor plan
 *  of width and height, using a cost entered by the user
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Tile Cost");

        System.out.println("Length of tile:");
        double length = userInput();
        System.out.println("Width of Tile:");
        double width = userInput();

        //System.out.println(width + "\n" + length);

        System.out.println("Type of Tile?: \n" + "1. wood\n" + "2. linoleum\n" + "3. carpet\n");
        double cost = tileTypes(width, length);

        System.out.println("Total Cost of tile: " + cost);

        System.out.println("End of file");
    }

    /**
     * prices for wood already set receives length and width in program and applies them to
     * program result
     *
     * @param w
     * @param l
     * @return
     */

    private static double tileTypes(double w, double l) {
        //tile types and prices go here
        double wood  = 3.50;
        double lino = 1.50;
        double carpet = 5.00;
        double cost = 0.0;

        int choice = tileChoice();

        if (choice == 1) cost = tileCalc(w, l, wood);
        else if (choice == 2) cost = tileCalc(w, l, lino);
        else if (choice == 3) cost = tileCalc(w, l, carpet);

        //tileCalc(w, l, tile[choice]);

        return cost;
    }

    /**
     * returns multiplied value from length, width, and cost of tile per square foot
     *
     * @param w
     * @param l
     * @param choice
     * @return
     */

    private static double tileCalc(double w, double l, double choice) {
        return w * l * choice;
    }

    /**
     * receives if else choice value from user
     * note: see userIntInput
     *
     * @return
     */

    private static int tileChoice() {
        int choice = userIntInput();
        return choice;
    }

    /**
     * collects user generated input using scanner class for int
     *
     * @return
     */

    private static int userIntInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    /**
     * accepts user generated doubles using scanner class for double
     *
     * @return
     */

    private static double userInput() {
        //accepts user double

        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}
