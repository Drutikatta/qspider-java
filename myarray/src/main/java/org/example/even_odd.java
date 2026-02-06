package org.example;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many elements elements");
        int size=s.nextInt();
        int [] arr= new int[size];
        System.out.println("enter the elements");

        int pos=0;
        int nega=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
//                System.out.println( arr[i] + " is positive");
                pos++;
            }
            else {
//                System.out.println( arr[i] + " is negative");
                nega++;
            }
        }
        System.out.println(pos +" are positive");
        System.out.println(nega+ " are negative");
    }
}
