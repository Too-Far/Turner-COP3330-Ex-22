/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App
{
    public static void handleOutput(int largest) {
        System.out.println("The largest number is: " + largest);
    }
    public static void compareValues(int first, int second, int third) throws Exception {
        if (first > second && first > third) {
            handleOutput(first);
        } else if (second > first && second > third) {
            handleOutput(second);
        } else if (third > first && third > second) {
            handleOutput(third);
        } else {
            throw new Exception("There seems to be a problem, No number is largest");
        }
    }

    public static void getInput() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first;
        int second;
        int third;
        while (true) {
            try {
                System.out.println("Enter the first Number: ");
                first = Integer.parseInt(reader.readLine());

                System.out.println("Enter the second number: ");
                second = Integer.parseInt(reader.readLine());

                System.out.println("Enter the third number");
                third = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        }
        if (first == second && first == third) {
            System.exit(0);
        } else {
            compareValues(first, second, third);
        }

    }
    public static void main( String[] args ) throws Exception
    {
        getInput();
    }
}
