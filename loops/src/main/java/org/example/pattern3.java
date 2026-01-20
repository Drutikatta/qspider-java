package org.example;

public class pattern3 {
    public static void main(String[] args) {
        // * * * * *
        // *   *   *
        // * * * * *
        // *   *   *
        // * * * * *

        int num=7;
        int mid=num/2+1;
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i==1 || j==num || i==num || j==1 || j==mid || i==mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
