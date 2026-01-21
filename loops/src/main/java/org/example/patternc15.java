package org.example;

public class patternc15 {
    public static void main(String[] args) {
        int num=5;
        char ch='A';
        int num1=1;
        for(int i =1;i<=num;i++){

            for (int j=1;j<=num;j++){
                if(i%2!=0){
                    System.out.print(ch+ " ");
                }
                else{
                    System.out.print(num1+ " " );
                }
            }
            if(i%2!=0) ch++;
            else num1++;
            System.out.println();
        }
    }
}
