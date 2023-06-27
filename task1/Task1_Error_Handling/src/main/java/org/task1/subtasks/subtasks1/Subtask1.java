package org.task1.subtasks.subtasks1;

import java.util.Scanner;

public class Subtask1 {
    static Scanner scanner = new Scanner(System.in);
    public static void start(){
        System.out.println("Subtask1\n");
        System.out.println("Demo exceptions:");
        System.out.println("1. InputMismatchException");
        System.out.println("2. StackOverflowError");
        System.out.print("\nChoose your option: ");
        if (scanner.hasNextInt()){
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Your number is: " + input("\nInput number: "));
                    break;
                case 2:
                    stackOverflowError();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid!\n");
                    break;
            }

        } else{
                System.out.println("Invalid!\n");
        }
    }

    // method for Demo InputMismatchException
    public static int input(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
        }

    // method for Demo StackOverflowError
    static void stackOverflowError(){
        stackOverflowError();
    }

    static void test(){
        label:{
            
        }
    }

}

