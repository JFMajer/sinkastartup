package org.sinkastartup;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // initialize SimpleStartup class
        SimpleStartup simpleStartup = new SimpleStartup();

        //initialize an array of chars of length 7
        String[] grid = new String[7];
        Arrays.fill(grid, "[ ]");

        boolean gameOver = false;
        int userGuess;
        while (!gameOver) {
            printInfo(grid);
            userGuess = getUserInput();
            String state = simpleStartup.checkYourself(userGuess);
            if (simpleStartup.getNumOfHits() == 3) {
                gameOver = true;
                System.out.println("You win!");
            }
            if (state.equals("hit")) {
                grid[userGuess] = "[X]";
                System.out.println("Hit!");
            } else if (state.equals("miss")) {
                grid[userGuess] = "[O]";
                System.out.println("Miss!");
            }
        }
    }

    // function that prints information
    public static void printInfo(String[] grid) {
        for (String ele : grid) {
            System.out.print(ele);
        }
        System.out.println();
    }

    // function that gets user input
    public static int getUserInput() {
        System.out.println("Enter a number between 1 and 7: ");
        Scanner sc=new Scanner(System.in);
        int guess = sc.nextInt();
        return guess - 1;
    }

}

