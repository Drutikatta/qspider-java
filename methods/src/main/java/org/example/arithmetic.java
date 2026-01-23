package org.example;
import java.util.Scanner;

public class arithmetic {
    static Scanner s =new Scanner(System.in);
     static int a = s.nextInt();
    static int b = s.nextInt();
    public static void main(String[] args) {
        System.out.println("main starts");
        add();
        sub();
        mul();
        div();
        System.out.println("main end");
    }

    public static void add() {

        System.out.println("The addintion is " + (a+b));
    }

    public static void sub() {
        System.out.println("The addintion is " + (a-b));
    }

    public static void mul() {
        System.out.println("The addintion is " + (a*b));
    }
    public static void div() {
        System.out.println("The addintion is " + (a/b));
    }
}
