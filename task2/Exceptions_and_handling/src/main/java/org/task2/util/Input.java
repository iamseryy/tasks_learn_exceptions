package org.task2.util;

import java.util.Scanner;

public final class Input {
    private static Input instance;
    private Scanner scanner;

    private Input(){
        this.scanner = new Scanner(System.in);
    }

    public static Input getInstance(){
        if(instance == null){
            instance = new Input();
        }
        return instance;
    }

    public String next(){
        return this.scanner.next();
    }

    public String nextLine(){
        return this.scanner.nextLine();
    }

    public int nextInt(){
        return this.scanner.nextInt();
    }

    public boolean hasNextInt(){
        return this.scanner.hasNextInt();
    }

    public float nextFloat(){
        return this.scanner.nextFloat();
    }

    public boolean hasNextFloat(){
        return this.scanner.hasNextFloat();
    }

    public void close(){
        this.scanner.close();
    }
}
