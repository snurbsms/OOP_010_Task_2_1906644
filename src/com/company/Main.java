package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double rootOne = 0;
        double rootTwo = 0;


        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a value for A: ");
        double a = userInput.nextDouble();

        System.out.println("Enter a value for B: ");
        double b = userInput.nextDouble();

        System.out.println("Enter a value for C: ");
        double c = userInput.nextDouble();

        System.out.println("");
        System.out.println("Creating determinant using equation: (b*b) - (4*a*c) then Square Root!");
        System.out.println("");

        double determ = (b*b) - (4*a*c);
        double squareRoot = Math.sqrt(determ);

        if (determ > 0) {
            rootOne = (-b + squareRoot) / (2*a);
            rootTwo = (-b - squareRoot) / (2*a);
            System.out.println("Your problem has TWO roots. These are: "+ rootOne + "and "+ rootTwo);
        } else if(determ == 0){
            System.out.println("Your problem only has ONE root. This is: " + (-b + squareRoot) / (2*a));
        } else if(determ < 0) {
            System.out.println("Your problem has no roots.");
        }

    }
}
