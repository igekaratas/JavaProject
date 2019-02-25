/**
 * Name: Mehmet Karatas
 * Class Name: Java Programming
 * Assignment: LabWork1
 *
 * Description: This program asks users about the dimensions of the room
 * and the number of the doors and windows. After getting these info about the
 * room, it calculates how much paint do we need to paint the room in gallon.
 */

package com.mehmet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // I created a method to do calculation.
        mehmetPaintFunc();


    }

    public static void mehmetPaintFunc() {
        Scanner myReader = new Scanner(System.in);

        double totalSqFt;
        double paintNeeded;

        final int COVERAGE = 350; //paint covers 350 sq ft/gal

        System.out.println("Enter the height of the room: ");
        int height = myReader.nextInt();
        System.out.println("Enter the length of the room: ");
        int length = myReader.nextInt();
        System.out.println("Enter the width of the room: ");
        int width = myReader.nextInt();

        // Now we are asking for doors and windows.
        System.out.println("Please enter the # of doors in the room.");
        int doors = myReader.nextInt();

        System.out.println("How many windows does the room has? ");
        int windows = myReader.nextInt();



        totalSqFt = 2 * (height*width + height*length) - (doors*20) - (windows*15);
        paintNeeded = totalSqFt/COVERAGE;

        System.out.println("Your room is " + totalSqFt + " sq and needs " + paintNeeded + " gallons of " +
                "paints in total. ");

    }
}
