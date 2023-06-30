package org.task2.subtasks.subtask4;

import org.task2.subtasks.subtask4.exception.EmptyLineException;

import java.util.Scanner;

public class Subtask4 {
    public static void start() {
        while (true){
            try {
                System.out.print("\nInput message: ");
                System.out.println("Your message is: " + input());
                break;
            } catch (EmptyLineException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String input() throws EmptyLineException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        if (line.trim().isEmpty()) {
            throw new EmptyLineException("Empty lines are not allowed");
        }



        return line;
    }

}
