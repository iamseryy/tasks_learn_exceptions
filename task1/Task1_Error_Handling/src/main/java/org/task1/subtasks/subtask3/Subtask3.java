package org.task1.subtasks.subtask3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Subtask3 {
    static Scanner scanner = new Scanner(System.in);
    public static void start(){
        System.out.println("\nSubtask3");
        System.out.println("Arrays division");
        System.out.print("Enter the first integer array separated by a space: ");
        String line1 = scanner.nextLine();
        System.out.print("Enter the second integer array separated by a space: ");
        String line2 = scanner.nextLine();

        int[] arr1 = Arrays.stream(line1.split(" ")).mapToInt(str -> Integer.parseInt(str)).toArray();
        int[] arr2 = Arrays.stream(line2.split(" ")).mapToInt(str -> Integer.parseInt(str)).toArray();

        System.out.print("\nResult: ");
        Arrays.stream(divide(arr1, arr2)).forEach(item -> System.out.print(item + "; "));
        System.out.println();

        scanner.close();
    }

    private static Double[] divide(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            throw new RuntimeException("Error! Array sizes are not equal");
        }

        return IntStream.range(0, arr1.length)
                .mapToDouble(index -> (arr1[index] * 1.0)/ (arr2[index] * 1.0))
                .boxed()
                .toArray(Double[]::new);
    }
}
