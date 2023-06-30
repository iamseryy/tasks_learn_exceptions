package org.task2.subtasks.subtask3;

import java.io.FileNotFoundException;

public class Subtask3 {
    public static void start(){

    }

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        // fix order
        //} catch (Throwable ex) {
        //    System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        // fix order
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }



    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}
