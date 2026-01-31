package org.example;

import java.util.Scanner;

public class posi_negative {
    public static void main(String[] args) {
        //wajp to identify the no of positive ele n negative ele

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=s.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter" +arr.length+ "elements in an array");
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        int posicount=0;
        int negacount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                System.out.println(arr[i]+" is positive");
                posicount++;
            }
            else {
                System.out.println(arr[i]+ " is negative");
                negacount++;
            }
        }
        System.out.println("total positive elements " +posicount);
        System.out.println("total negative elements " +negacount);
    }
}
