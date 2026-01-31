package org.example;

import java.util.Scanner;

public class evenofsun_oddofavg {
    public static void main(String[] args) {

        //wajp to identify the sum of even index elements n avergae of odd index elements4

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=s.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter" +arr.length+ "elements in an array");
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        int avg=0;
        int sum=0;
        int count=0;
        for (int i =0;i<arr.length;i++){
            if (i%2==0){
                sum=sum+arr[i];
            }
            else {
                avg=avg+arr[i];
                count++;
            }
        }
        System.out.println("the sum of even idex is "+sum);
        System.out.println("the average of odd index is "+avg/count);
    }
}


