package org.task1.subtasks.subtask2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Subtask2 {
    static Scanner scanner = new Scanner(System.in);
    public static void start(){
        System.out.println("\nSubtask2");
        System.out.println("Arrays subtraction");
        System.out.print("Enter the first integer array separated by a space: ");
        String line1 = scanner.nextLine();
        System.out.print("Enter the second integer array separated by a space: ");
        String line2 = scanner.nextLine();

        int[] arr1 = Arrays.stream(line1.split(" ")).mapToInt(str -> Integer.parseInt(str)).toArray();
        int[] arr2 = Arrays.stream(line2.split(" ")).mapToInt(str -> Integer.parseInt(str)).toArray();

        Integer[] result = subtract(arr1, arr2);
        if(result[0] == null){
            switch (result[1]){
                case -1:
                    System.out.println("\nError! Array sizes are not equal");
                    break;
                default:
                    System.out.println("Unknown error");
                    break;
            }
        } else {
            System.out.print("\nResult: ");
            Arrays.stream(result).forEach(item -> System.out.print(item + "; "));
            System.out.println();
        }

        scanner.close();
    }

    public static Integer[] subtract(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
           return new Integer[]{null, -1};
        }

        return IntStream.range(0, arr1.length).map(index -> arr1[index] - arr2[index]).boxed().toArray(Integer[]::new);
    }
}
