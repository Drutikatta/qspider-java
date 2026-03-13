package org.example;

public class decre {
    public static void main(String[] args) {
        int a = 10;
        int b = a-- +12;
        int c = --b + ++a +a;
        int d = c++ + --b+ a-- +5;

        System.out.println(a-- + ++b + c-- + ++d);
        System.out.println(a++ +b-- + c++ + d--);
        System.out.println(--a + --b + --c + --d);
        System.out.println(++a + b-- + --c + d++);

        System.out.println(a+b+c+d);
    }
}
