package org.example;

public class pattern9 {
    public static void main(String[] args) {
//        1 1 1 1 1
//          2 2 2 2
//            3 3 3
//              4 4
//                5

        int num=5;
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i<=j)
                    System.out.print(" "+i);
//                System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
