package org.example;

public class pattern12 {
    public static void main(String[] args) {
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
        int num =5;
        for(int i =1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
