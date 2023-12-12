package hw5.State;

import hw5.ElevatorMachine;

/**
 * File: FloorThreeState.java
 * Type: Class (implements Interface)
 * Purpose: Represents methods for the state of being on floor 3
 */
public class FloorThreeState implements State {
    ElevatorMachine elevMachine;

    public FloorThreeState(ElevatorMachine elevatorMachine) {
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
