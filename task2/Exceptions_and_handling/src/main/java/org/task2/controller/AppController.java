package org.task2.controller;

import org.task2.subtasks.subtask1.Subtask1;

import java.util.Scanner;

public class AppController {
    static Scanner scanner = new Scanner(System.in);
    public static void start(){
        System.out.println("\nExceptions and their handling\n");
        System.out.println("1. Subtask 1 - Handling exceptions when entering a float number");
        System.out.println("2. Subtask 2 - Fix the code");
        System.out.println("3. Subtask 3 - Fix the code");
        System.out.println("4. Subtask 4 - Handling empty input strings");
        System.out.print("\nChoose your option: ");
        if (scanner.hasNextInt()){
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    Subtask1.start();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Invalid!\n");
                    break;
            }

        } else{
            System.out.println("Invalid!\n");
        }

        scanner.close();

    }
}
