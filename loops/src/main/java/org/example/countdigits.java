package org.example;
import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        //wajp to count the number of digits present in the given number
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int count=0;

        System.out.println("the number present are: " +i);
        while(i>0){
            i = i/10;
            count++;

        }System.out.println("the digits present are " + count);

    }
}
