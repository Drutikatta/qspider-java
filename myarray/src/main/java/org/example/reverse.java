package org.example;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size");
        int size= s.nextInt();
        int []arr=new int[size];
        System.out.println("enter the elements");
        for(int i = 0;i<arr.length;i++){
            arr[i]=s.nextInt();

        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
