// This program shows how to use NumberFormat and DecimalFormat

package com.company;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final double TAX_RATE = 0.06;
        int quantity;

        double subtotal, tax, totalCost, unitPrice;

        Scanner scan = new Scanner(System.in);

        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        NumberFormat fmt2 = NumberFormat.getPercentInstance();
        NumberFormat fmt3 = NumberFormat.getNumberInstance();

        System.out.println("Enter the quantity: ");

        quantity = scan.nextInt();

        System.out.println("Enter the unit price: ");
        unitPrice = scan.nextDouble();

        subtotal = quantity * unitPrice;

        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;

        System.out.println("Subtotal: " + fmt1.format(subtotal));

        System.out.println("Tax: " + fmt1.format(tax) + " at " + fmt2.format(TAX_RATE) + " tax rate.");


        System.out.println("Total: " + fmt3.format(totalCost));

        DecimalFormat dfrmt = new DecimalFormat("0.00");

        System.out.println(dfrmt.format(Math.PI));


    }
}