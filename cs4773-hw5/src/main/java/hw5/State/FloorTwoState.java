package hw5.State;

import hw5.ElevatorMachine;

/**
 * File: FloorTwoState.java
 * Type: Class (implements Interface)
 * Purpose: Represents methods for the state of being on floor 2
 */
public class FloorTwoState implements State {
    
    ElevatorMachine elevMachine;

    public FloorTwoState(ElevatorMachine elevatorMachine) {
        this.elevMachine = elevatorMachine;
    }

    public void Btn1Pressed() {
        elevMachine.processBtn1();
    }

    public void Btn2Pressed() {
        elevMachine.processBtn2();
    }

    public void Btn3Pressed() {
        elevMachine.processBtn3();
    }
}
