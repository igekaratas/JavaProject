/**
 * Name: Mehmet Karatas
 * Class Name: Java Programming
 * Assignment: Project 1
 *
 * Description: This is a simple calculator program that asks users for
 * to input two numbers and after that asks user to input the operator
 * that they want to use. These operators are +, -, * or /.
 * Based on operator the program does calculation. Once the calculation
 * is done, the program asks if the user want to play again and input
 * numbers and operator again. If the user wants, he can play unlimited time
 * as long as the user input y or Y for playing again.
 */

package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner wantToPlay = new Scanner(System.in);

        // The program starts with calling the method that I named simpleCalculator.
        simpleCalculator();

        // I used while loop to ask for user to play over and over again.
        // I used true boolean value to be able to repeat calling the method and play again.
        while (true) {

            System.out.print("Play again [Y/N]?:");

            // Asking character input from user y or Y for yes.
            char yesOrNo = wantToPlay.next(".").charAt(0);

            if(yesOrNo == 'Y' || yesOrNo == 'y') {

                // If the answer is yes the method is being called again.
                simpleCalculator();

            } else {

                System.out.println("Bye bye!");

                // I used break to end the while loop.
                break;

            }

        }

    }

    // I used method to make the code simple and more readable.

    public static void simpleCalculator() {

        System.out.println("Hi, I am really good at math! Put me to the test. ");

        System.out.print("Please enter two numbers and then press Enter: ");

        Scanner userInput = new Scanner(System.in);

        // I used DecimalFormat for three digit pattern.
        // After that I applied DecimalFormat to all results.
        DecimalFormat f = new DecimalFormat("0.000");

        // double type of two numbers for input.
        double num1 = userInput.nextDouble();
        double num2 = userInput.nextDouble();

        System.out.print("Please enter one of the operations +, -, * or / and press Enter: ");

        // For operator input asking user for character.
        char operator = userInput.next(".").charAt(0);

        // If conditional statement to get what kind of operator the user
        // want to use and does the calculation based on choice.
        if (operator == '+') {

            double sum = num1 + num2;

            System.out.println(num1 + " + " + num2 + " = " + f.format(sum));
            System.out.println("I'm great at addition! ");


        } else if (operator == '-') {
            double difference = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + f.format(difference));
            System.out.println("I'm great at subtraction! ");


        } else if (operator == '*') {

            double multiplication = num1 * num2;

            System.out.println(num1 + " * " + num2 + " = " + f.format(multiplication));
            System.out.println("I'm great at multiplication! ");


        } else if (operator == '/') {

            double division = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + f.format(division));
            System.out.println("I'm great at division!");

        } else {

            System.out.println("I can compute really well, but what you entered is not one of the operations I know ...");
        }
    }
    // The method ends here.
}
