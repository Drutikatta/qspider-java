package org.example;

public class pattern10 {
    public static void main(String[] args) {
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
        int num=5;
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i+j<=num+1)
                    System.out.print(" "+j);
//                System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
