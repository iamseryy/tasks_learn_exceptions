package org.task2.controller;

import org.task2.subtasks.subtask1.Subtask1;
import org.task2.subtasks.subtask2.Subtask2;
import org.task2.subtasks.subtask3.Subtask3;
import org.task2.subtasks.subtask4.Subtask4;
import org.task2.util.Input;


public class AppController {
    public static Input input = Input.getInstance();

    public static void start(){
        System.out.println("\nExceptions and their handling\n");
        System.out.println("1. Subtask 1 - Handling exceptions when entering a float number");
        System.out.println("2. Subtask 2 - Fix the code");
        System.out.println("3. Subtask 3 - Fix the code");
        System.out.println("4. Subtask 4 - Handling empty input strings");
        System.out.print("\nChoose your option: ");
        if (input.hasNextInt()){
            int option = input.nextInt();
            switch (option){
                case 1:
                    Subtask1.start();
                    break;
                case 2:
                    Subtask2.start();
                    break;
                case 3:
                    Subtask3.start();
                    break;
                case 4:
                    Subtask4.start();
                    break;
                default:
                    System.out.println("Invalid!\n");
                    break;
            }
        } else{
            System.out.println("Invalid!\n");
        }

        input.close();
    }
}
