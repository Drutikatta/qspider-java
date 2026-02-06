package org.example;

import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=s.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter" +arr.length+ "elements in an array");

        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int max=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("is largest "+max);
    }
}
