package com.shanegames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Purchase p = new Purchase();

        Scanner inputProduct = new Scanner(System.in);
        Scanner inputPrice = new Scanner(System.in);



        System.out.println("Product?");
        Purchase.product = inputProduct.nextLine();

        System.out.println("Price?");
        Purchase.amount = inputProduct.nextDouble();

        System.out.println("Calculating");

        double tax = Purchase.amount * 0.13;
        double total = Purchase.amount + tax;

        System.out.println("Name: " + Purchase.product);
        System.out.println("Price: " + Purchase.amount);
        System.out.println("Total After Tax: " + total);
        System.out.println("Deducting " + total + " Dollars From Card...");
        Card.money -= total;
        System.out.println("Money Left: " + Card.money);
        System.out.println("Purchase Complete!");
        System.out.println("Written by: Shane-Games");


    }
}
