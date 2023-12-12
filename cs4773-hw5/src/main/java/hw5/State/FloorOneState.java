package hw5.State;

import hw5.ElevatorMachine;

/**
 * File: FloorOneState.java
 * Type: Class (implements Interface)
 * Purpose: Represents methods for the state of being on floor 1
 */
public class FloorOneState implements State {
    
    ElevatorMachine elevMachine;

    public FloorOneState(ElevatorMachine elevatorMachine) {
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
