package org.example;

public class patternc17 {
    public static void main(String[] args) {
        int num=4;
        char ch='A';
        int num1=1;
        for(int i =1;i<=num;i++){

            for (int j=1;j<=num-1;j++){
                if(i%2!=0){
                    System.out.print(ch+ " ");
                }
                else{
                    System.out.print(num1+ " " );
                    num1++;
                }
            }
            if(i%2!=0) ch++;

            System.out.println();
        }
    }
}
