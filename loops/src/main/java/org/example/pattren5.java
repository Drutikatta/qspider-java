package org.example;

public class pattren5 {
    public static void main(String[] args) throws Exception{
        //*           *
        //  *       *
        //    *   *
        //      *
        //    *   *
        //  *       *
        //*           *
        int num=7;
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                if (i==j || i+j==num+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                Thread.sleep(100);
            }
            System.out.println();
        }
    }
}
