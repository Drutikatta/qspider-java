package org.example;
import java.util.Scanner;


public class switch_other {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        char ch= s.next().charAt(0);
        switch (ch){
            case 'a','e','i','o','u','A','E','I','O','U':
            {
                System.out.println(ch + " is a vowel");
                break;
            }
            default:
            {
                System.out.println(ch +" is a consonant");
            }
        }
    }
}
