/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program converts currency.
// Specifically, converts euros to U.S. dollars.
// Prompts for the amount of money in euros you have, and prompts for the
// current exchange rate of the euro. Prints out the new amount in U.S.
// dollars.

package org.example;

import java.util.*;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // prompt the user for the amount of euros to be exchanged
        // store it accordingly using float conversion
        System.out.print("How many euros are you exchanging? ");
        float euros = Float.valueOf(scanner.nextLine());

        // prompt the user for the exchange rate
        // store it accordingly using float conversion
        System.out.print("What is the exchange rate? ");
        float rateOfExchange = Float.valueOf(scanner.nextLine());

        // calculate the USD value and round up to the next penny
        // using the Math.round() function
        double USDValue = Math.round((euros * rateOfExchange) * 100.0) / 100.0;

        // output as expected from the assignment
        System.out.print(euros + " euros at an exchange rate of " + rateOfExchange + " is\n" + USDValue + " U.S. dollars.");

    }

}
