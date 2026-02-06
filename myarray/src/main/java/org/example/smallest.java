package org.example;
import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size");
        int size= s.nextInt();
        int []arr=new int[size];
        System.out.println("enter the elements");
        for(int i = 0;i<arr.length;i++){
            arr[i]=s.nextInt();

        }
        int low=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<low){
                low=arr[i];
            }
        }
        System.out.println(low);
    }
}
