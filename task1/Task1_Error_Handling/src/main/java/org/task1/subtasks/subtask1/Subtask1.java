package org.task1.subtasks.subtask1;

import java.util.Scanner;

public class Subtask1 {
    static Scanner scanner = new Scanner(System.in);
    public static void start(){
        System.out.println("Subtask1\n");
        System.out.println("Demo exceptions:");
        System.out.println("1. InputMismatchException");
        System.out.println("2. StackOverflowError");
        System.out.println("3. NumberFormatException");
        System.out.print("\nChoose your option: ");
        if (scanner.hasNextInt()){
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Your number is: " + demoInputMismatchException("\nInput number: "));
                    break;
                case 2:
                    demoStackOverflowError();
                    break;
                case 3:
                    System.out.print("\nInput number: ");
                    System.out.println("Your number is: " + demoNumberFormatException(scanner.next()));

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

    // method for Demo InputMismatchException
    public static int demoInputMismatchException(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    // method for Demo StackOverflowError
    static void demoStackOverflowError(){
        demoStackOverflowError();
    }

    // method for Demo NumberFormatException
    static Integer demoNumberFormatException(String str){
        return Integer.parseInt(str);
    }
}

