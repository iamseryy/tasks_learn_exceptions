package org.task2.subtasks.subtask1;

import org.task2.util.Input;

public class Subtask1 {
    public static Input input = Input.getInstance();

    public static void start(){
        System.out.println("Your number is: " + input("\nInput float number: "));
    }

    private static float input(String message){
        while (true){
            System.out.print(message);
            if (input.hasNextFloat()) {
                return input.nextFloat();
            } else {
                System.out.println("Invalid! Try again");
                input.next();
            }
        }
    }
}
