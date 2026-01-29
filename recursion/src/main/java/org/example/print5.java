package org.example;

public class print5 {
    public static void main(String[] args) {
        test(1);
    }

    public static void test(int a) {
        System.out.println(a);
        a++;
        if(a>5){
            return;
        }
        test(a);
    }
}
