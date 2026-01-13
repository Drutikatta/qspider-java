package org.example;
import java.util.Scanner;
import java.util.Random;

public class zomato {
    public static void main(String[]args){
        System.out.println("Pls select your food");
        System.out.println("1 for Breakfast");
        System.out.println("2 for Lunch");
        System.out.println("3 for Dinner");
        System.out.println("4 for Soft Drinks");
        System.out.println("5 for Desserts");
        Random r= new Random();
        int ran= r.nextInt(9999);
        Scanner s = new Scanner(System.in);
        int choice= s.nextInt();

        if(choice==1){
            System.out.println("1 for Poha");
            System.out.println("2 for Dosa");
            System.out.println("3 for Idli");
            int brea= s.nextInt();
            switch (brea){

                case 1:
                {
                    System.out.println("Poha is being cooked");
                    break;
                }
                case 2:
                {
                    System.out.println("Dosa is being cooked");
                    break;
                }
                case 3:
                {
                    System.out.println("idli is being cooked");
                    break;
                }
                default:{
                    System.out.println("Invalid Choice");
                    break;
                }
            }
        } else if (choice==2) {
            System.out.println("1 for Biryani");
            System.out.println("2 for Roti");
            System.out.println("3 for Thali");
            int lunch= s.nextInt();
            switch (lunch){

                case 1:
                {
                    System.out.println("Biryani is being cooked");
                    break;
                }
                case 2:
                {
                    System.out.println("Roti is being cooked");
                    break;
                }
                case 3:
                {
                    System.out.println("Thali is being cooked");
                    break;
                }
                default:{
                    System.out.println("Invalid Choice");
                    break;
                }
            }
        }
        else if (choice==3) {
            System.out.println("1 for chicken Biryani");
            System.out.println("2 for Naan");
            System.out.println("3 for Salaad");
            int din= s.nextInt();
            switch (din){

                case 1:
                {
                    System.out.println("chicken Biryani is being cooked");
                    break;
                }
                case 2:
                {
                    System.out.println("Naan is being cooked");
                    break;
                }
                case 3:
                {
                    System.out.println("Salaad is being cooked");
                    break;
                }
                default:{
                    System.out.println("Invalid Choice");
                    break;
                }
            }
        }
        else if (choice==4) {
            System.out.println("1 for coco-cola");
            System.out.println("2 for Mazza");
            System.out.println("3 for Mojito");
            int soft= s.nextInt();
            switch (soft){

                case 1:
                {
                    System.out.println("Coco-cola is being cooked");
                    break;
                }
                case 2:
                {
                    System.out.println("Mazza is being cooked");
                    break;
                }
                case 3:
                {
                    System.out.println("Mojito is being cooked");
                    break;
                }
                default:{
                    System.out.println("Invalid Choice");
                    break;
                }
            }
        }
        else if (choice==5) {
            System.out.println("1 for Chocolate cake");
            System.out.println("2 for Ice-creame");
            System.out.println("3 for Shake");
            int des= s.nextInt();
            switch (des){

                case 1:
                {
                    System.out.println("Chocolate cake is being cooked");
                    break;
                }
                case 2:
                {
                    System.out.println("Ice-creame is being cooked");
                    break;
                }
                case 3:
                {
                    System.out.println("Shake is being cooked");
                    break;
                }
                default:{
                    System.out.println("Invalid Choice");
                    break;
                }
            }
        }
        else{
            System.out.println("Select the Food Type");
        }
        System.out.println("Your order Id: "+ran);
    }
}
