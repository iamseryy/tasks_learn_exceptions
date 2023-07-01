package org.task2.subtasks.subtask3;

import java.io.FileNotFoundException;

public class Subtask3 {
    public static void start(){
        main(new String[]{});
    }

    public static void main(String[] args)

    //Обычно метод main это точка входа в приложение
    // и не имеет смысла пробрасывать исключение выше.
    // Кроме того, плохая практика пробрасывать Exception, так как не будет понятно,
    // что пошло не так и как решить проблему.
    //throws Exception

    {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;

        // 1. Throwable суперкласс для всех исключений и ошибок, поэтому он должен находиться в конце всех блоков catch.
        // 2. Ловить и обрабатавать Throwable плохая практика так как не понятно, что пошло не так и как решить проблему.
        // 3. В данном примере нет потенциальных кейсов, для того, чтобы ловить Throwable, единственная исключительная
        // ситуация это IndexOutOfBoundsException, а она обрабатывается отдельно, поэтому в Throwable нет необходимости.
        //} catch (Throwable ex) {
        //
        //    System.out.println("Что-то пошло не так...");


        // Нет случаев для NPE (нет throw NullPointerException; нет потенциальных обращений к null ссылке)
        //} catch (NullPointerException ex) {
        //    System.out.println("Указатель не может указывать на null!");

        } catch (IndexOutOfBoundsException ex) {

            System.out.println("Массив выходит за пределы своего размера!");

        }
    }

    public static void printSum(Integer a, Integer b)
    // Не нужно, потому что в методе нет классов FileInputStream, FileOutputStream и RandomAccessFile
    // при использовании, которых может возникнуть данное исключение, когда необходимо передать путь к файлу
            //throws FileNotFoundException
    {
        System.out.println(a + b);
    }

}
