package org.example;
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=s.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter" +arr.length+ "elements in an array");

        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        for (int i = 0;i<arr.length;i++)
        {
            if(arr[i]%2==0){
                System.out.println(arr[i]+" is even");
            }
            else {
                System.out.println(arr[i]+ " is odd");
            }
        }
    }
}
