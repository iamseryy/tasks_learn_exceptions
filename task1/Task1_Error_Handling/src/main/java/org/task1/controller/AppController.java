package org.task1.controller;

import org.task1.subtasks.subtask1.Subtask1;
import org.task1.subtasks.subtask2.Subtask2;
import org.task1.subtasks.subtask3.Subtask3;

import java.util.Scanner;

public class AppController {
    static Scanner scanner = new Scanner(System.in);
    public static void start(){
        System.out.println("\nExceptions in programming and their handling\n");
        System.out.println("1. Subtask 1 - Demo exceptions ");
        System.out.println("2. Subtask 2 - Arrays subtraction");
        System.out.println("3. Subtask 3 - Arrays division");
        System.out.print("\nChoose your option: ");
        if (scanner.hasNextInt()){
            int option = scanner.nextInt();
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
