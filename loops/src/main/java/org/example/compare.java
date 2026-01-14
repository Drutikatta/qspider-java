package org.example;

public class compare {
    public static void main(String[] args) {
        int x= 10;
        int y=11;
        if(x++>y--||x--<=y--){
            System.out.println("hello");
        }
        System.out.println(x);
        System.out.println(y);
    }
}
