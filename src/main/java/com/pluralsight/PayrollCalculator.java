package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args){
        // create scanner
        Scanner PayrollCalculator = new Scanner(System.in);
        // ask the user for name
        System.out.print("Enter your name: ");
        // store the answer for the user
        String Name = PayrollCalculator.next();
        // ask the user how many hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = PayrollCalculator.nextInt();

    }
}
