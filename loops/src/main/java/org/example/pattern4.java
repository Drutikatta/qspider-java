package org.example;

public class pattern4 {
    public static void main(String[] args) {
        //~ diagonal
        //*
        //  *
        //    *
        //      *

        int num=4;
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                if (i==j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("different diagonal");
        int num1=5;
        for (int a=1;a<=num1;a++){
            for (int b=1;b<=num1;b++){
                if(a+b==num+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
