package org.example;

public class even_dowhile {
    public static void main(String[] args) {
        System.out.println("main started");
        int i =2;
        int count=0;
        do{
            System.out.println(i);
            i++;
            i++;
            count++;
        }while (i<=10);
        System.out.println(count);

        //~ sir methods
//        do {
//            if (i%2==0){
//                System.out.println(i);
//            }
//            count++;
//            i++;
//        }while (i<=10);
//        System.out.println("main ended");
//        System.out.println(count);

//        do{
//            System.out.println(i);
//            i=i+2;
//            count++;
//        }while (i<=10);
//        System.out.println("main ended");
//        System.out.println(count);
    }
}
;