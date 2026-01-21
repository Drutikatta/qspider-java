package org.example;

public class patternc12 {
    public static void main(String[] args) {
        int num =5;

        for(int i =1;i<=num;i++){
            char ch='A';
            for (int j=1;j<=i;j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}
