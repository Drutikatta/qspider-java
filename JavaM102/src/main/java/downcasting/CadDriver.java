package downcasting;

import java.util.Scanner;

public class CadDriver {
    public static void main(String[] args) {

        System.out.println("Press 1 to chose Mini");
        System.out.println("Press 2 to chose Sedan");
        System.out.println("Press 3 to chose Suv");
        Scanner s= new Scanner(System.in);
        int chose=s.nextInt();

        Cab c = null;

        switch (chose){
            case 1: {
                c= new Mini("Rahul",123456,987456321,4,250,3);
                Mini m=(Mini)c;
                m.PrintDetails();
            }
            case 2: {
                c= new Sedan("Xyz",2589,987456632,7,360,4);
                Sedan s1=(Sedan) c;
                s1.PrintDetails();
            }
            case 3: {
                c=new Suv("abc",8745,321456987,3,987,2.5f);
                Suv su=(Suv) c;
                su.PrintDetails();
            }
        }


    }
}
