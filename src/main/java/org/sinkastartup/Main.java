package org.sinkastartup;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // initialize SimpleStartup class
        SimpleStartup simpleStartup = new SimpleStartup();

        //initialize an array of ints
        int[] myArray = simpleStartup.getCellLocation();
        for (int i : myArray) {
            System.out.print(i);
        }
    }
}