package org.example;

public class triangle2 {
    public static void main(String[] args) {
        //* * * * * * *
        //  * * * * *
        //    * * *
        //      *
        int num = 4;
        for(int i=num;i>=1;i--){
            for (int j=1;j<=num*2-1;j++){
                if(i+j>=num+1 && j-i<=num-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
