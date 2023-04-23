package org.sinkastartup;

import java.util.Arrays;

public class SimpleStartup {
    // declare array of int to hold cell location
    private int[] cellLocation = new int[7];
    private int numOfHits;

    // constructor
    public SimpleStartup() {
        // create random int between 0 and 4
        int randomNum = (int) (Math.random() * 5);
        // randomNum marks the beginning of 'ship' with length 3
        cellLocation[randomNum] = 1;
        cellLocation[randomNum + 1] = 1;
        cellLocation[randomNum + 2] = 1;
        numOfHits = 0;
    }

    // method that takes int and return result representing a hit, miss or kill
    String checkYourself(int guess) {
        if (cellLocation[guess] == 1) {
            numOfHits++;
            if (numOfHits == 3) {
                cellLocation[guess] = -1;
                return "kill";
            } else {
                cellLocation[guess] = -1;
                return "hit";
            }
        } else if (cellLocation[guess] == -1) {
            return "already hit";
        }
        else {
            return "miss";
        }
    }

    // getter for cellLocation
    public int[] getCellLocation() {
        return cellLocation;
    }

    // getter for numOfHits
    public int getNumOfHits() {
        return numOfHits;
    }

}
