package org.example;
import java.util.Scanner;

public class switch_spl {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        if(ch>='A'&& ch<'Z'|| ch>='a'&& ch<='z'){
            switch (ch){
                case 'a','e','i','o','u','A','E','I','O','U':
                {
                    if(ch>='A'&&ch<='Z')
                    System.out.println(ch + "is uppercase n is a vowel");
                    else
                        System.out.println(ch + " is lower case n vowel");
                    break;
                }
                default:
                {
                    if(ch>='A'&&ch<='Z')
                        System.out.println(ch + "is uppercase n is a consonant");
                    else
                        System.out.println(ch + " is lower case n is a consonant");
                }
            }

        } else if (ch>='0' && ch<='9') {
            System.out.println(ch + " is a number");
        }
        else
            System.out.println(ch + " is a special char");

    }
}
