package org.example;
import java.util.Scanner;

public class claculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch1;

        do {
            System.out.println("Press '+' for addition");
            System.out.println("Press '-' for subtraction");
            System.out.println("Press '*' for multiplication");
            System.out.println("Press '/' for division");

            char ch = s.next().charAt(0);

            System.out.println("Enter the 1st value:");
            int a = s.nextInt();

            System.out.println("Enter the 2nd value:");
            int b = s.nextInt();

            switch (ch) {
                case '+':
                    add(a, b);
                    break;

                case '-':
                    sub(a, b);
                    break;

                case '*':
                    mul(a, b);
                    break;

                case '/':
                    div(a, b);
                    break;

                default:
                    System.out.println("Choose a valid option...");
            }

            System.out.println("Do you want to perform another operation?");
            System.out.println("Press 'Y' for yes and 'N' for no");
            ch1 = s.next().charAt(0);

        } while (ch1 == 'y' || ch1 == 'Y');

        s.close();
        System.out.println("Calculator closed. Thank you!");
    }

    public static void add(int a, int b) {
        System.out.println("Addition is: " + (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println("Subtraction is: " + (a - b));
    }

    public static void mul(int a, int b) {
        System.out.println("Multiplication is: " + (a * b));
    }

    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed!");
        } else {
            System.out.println("Division is: " + (a / b));
        }
    }
}
