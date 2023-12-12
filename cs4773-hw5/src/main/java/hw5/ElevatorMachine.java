package hw5;

import hw5.State.*;

/**
 * File: ElevatorMachine.java
 * Type: Class
 * Purpose: Represents machine of ElevatorSimulator
 */
public class ElevatorMachine {  
    State currentState;
    State floorOneState;
    State floorTwoState;
    State floorThreeState;

    public ElevatorMachine() {
        floorOneState = new FloorOneState(this);
        floorTwoState = new FloorTwoState(this);
        floorThreeState = new FloorThreeState(this);
        currentState = floorOneState;
    }

    public void processBtn1() {
        currentState = goToFloorOneState();
    }

    public void processBtn2() {
        currentState = goToFloorTwoState();
    }

    public void processBtn3() {
        currentState = goToFloorThreeState();
    }

    public State goToFloorOneState() {
        closeDoors();
        if (currentState == floorOneState) {
            System.out.println("Nothing happens...");
        }
        else {
            System.out.println("Going down...");
            System.out.println("*ding!* The elevator is now at Floor One");
            openDoors();
        }
        return floorOneState;
    }

    public State goToFloorTwoState() {
        closeDoors();
        if (currentState == floorTwoState) {
            System.out.println("Nothing happens...");
            return floorTwoState;
        }
        else if (currentState == floorOneState) {
            System.out.println("Going up...");
        }
        else {
            System.out.println("Going down...");
        }
            System.out.println("*Ding* The elevator is now at Floor Two");
            openDoors();
            
            return floorTwoState;
    }

    public State goToFloorThreeState() {
        closeDoors();
        if (currentState == floorThreeState) {
            System.out.println("Nothing happens...");
        }
        else {
            System.out.println("Going up...");
            System.out.println("*ding!* The elevator is now at Floor Three");
            openDoors();
        }
        return floorThreeState;
    }

    public void closeDoors() {
        System.out.println("Closing doors...");
    }

    public void openDoors() {
        System.out.println("Opening doors...");
    }
}
