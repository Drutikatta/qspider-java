package org.example;

import java.util.Scanner;

public class sum_ofodd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=s.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter" +arr.length+ "elements in an array");
        int sum=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                sum=sum+arr[i];
            }
        }
        System.out.println( "the odd sum is " + sum);
    }
}
