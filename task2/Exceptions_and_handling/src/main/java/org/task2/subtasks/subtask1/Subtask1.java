package org.task2.subtasks.subtask1;

import java.util.Scanner;

public class Subtask1 {
    static Scanner scanner = new Scanner(System.in);
    public static void start(){
        System.out.println("Your number is: " + input("\nInput float number: "));
    }

    private static float input(String message){
        while (true){
            System.out.print(message);
            if (scanner.hasNextFloat()) {
                float number = scanner.nextFloat();
                return number;
            } else {
                System.out.println("Invalid! Try again");
                scanner.next();
            }
        }
    }
}
