package org.sinkastartup;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleStartup {
    // declare array of int to hold cell location
    private ArrayList<Integer> cellLocation = new ArrayList<Integer>();
    private int numOfHits;

    // constructor
    public SimpleStartup() {
        this.cellLocation = new ArrayList<Integer>();
        // create random int between 0 and 4
        int randomNum = (int) (Math.random() * 5);

        // fill cellLocation with 0s
        for (int i = 0; i < 7; i++) {
            cellLocation.add(0);
        }
        // randomNum marks the beginning of 'ship' with length 3
        cellLocation.set(randomNum, 1);
        cellLocation.set(randomNum + 1, 1);
        cellLocation.set(randomNum + 2, 1);
        numOfHits = 0;
    }

    // method that takes int and return result representing a hit, miss or kill
    String checkYourself(int guess) {
        if (cellLocation.get(guess) == 1) {
            numOfHits++;
            if (numOfHits == 3) {
                cellLocation.set(guess, -1);
                return "kill";
            } else {
                cellLocation.set(guess, -1);
                return "hit";
            }
        } else if (cellLocation.get(guess) == -1) {
            return "already hit";
        }
        else {
            return "miss";
        }
    }


    // getter for numOfHits
    public int getNumOfHits() {
        return numOfHits;
    }

}
