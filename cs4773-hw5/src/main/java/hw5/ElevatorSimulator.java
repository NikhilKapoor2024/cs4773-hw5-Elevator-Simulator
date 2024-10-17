package hw5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * File: ElevatorSimulator.java
 * Type: Class
 * Purpose: Main driver class for XXXX
 */
public class ElevatorSimulator 
{
    public static void main( String[] args ) {
        ElevatorMachine elevMachine;
        String[] commands;
        String line = null;

        try {
            File inputFile = new File(args[0]);
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }
        commands = line.split(" ");
        System.out.println("Inputs to process: " + commands.length);

        elevMachine = new ElevatorMachine();
        for (int i = 0; i < commands.length; i++) {
            switch(commands[i]) {
                case "1":
                    System.out.println("1 pressed");
                    elevMachine.processBtn1();
                    break;
                case "2":
                    System.out.println("2 pressed");
                    elevMachine.processBtn2();
                    break;
                case "3":
                    System.out.println("3 pressed");
                    elevMachine.processBtn3();
                    break;
            }
        }
    }
}
