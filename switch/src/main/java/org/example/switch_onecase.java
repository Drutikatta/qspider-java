package org.example;
import java.util.Scanner;


public class switch_onecase {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println(" enter a char");
        char ch = s.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case'i':
            case 'o':
            case 'u':
            {
                System.out.println(ch +" is a vowel");
                break;
            }
            default:{
                System.out.println(ch +" is a consonant");
            }
        }
    }
}
