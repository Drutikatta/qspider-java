package org.example;
import java.util.Scanner;

public class patternc11 {
    public static void main(String[] args) {
//        A
//        B C
//        D E F
//        G H I J
//        K L M N O
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        char ch='a';
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}
