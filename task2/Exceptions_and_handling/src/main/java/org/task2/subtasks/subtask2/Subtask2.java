package org.task2.subtasks.subtask2;

public class Subtask2 {
        public static void start(){
        task2(new int[]{11, 22});
    }

    private static void task2(int[] intArray){
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException
                 // Добавлено исключение ArrayIndexOutOfBoundsException,
                 // т.к. потенциальная ситуация выхода за пределы массива
                 | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
