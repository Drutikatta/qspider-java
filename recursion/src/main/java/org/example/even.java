package org.example;
import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the start value");
        int start = s.nextInt();
        System.out.println("Enter the end value");
        int end=s.nextInt();
        test(start,end);
    }

    public static void test(int start,int end) {
        if(start%2==0){
            System.out.println(start + " is even");

        }
        start++;
        if(start>end){
            return;
        }
        test(start,end);

    }
}
