package org.example;

public class first5_num {

    public static void main(String[] args) {
        int i=1;

        //~product of 5 first num
//        int sum=1;
//        do{
//            sum = sum * i;
//            i++;
//            }while (i<=5);
//        System.out.println(sum);

        int sum=0;
        do{
            sum = sum + i;
            i++;
        }while (i<=5);
        System.out.println(sum);
        }
    }

