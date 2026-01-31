package org.example;

public class even_elements {
    public static void main(String[] args) {
        // wajp to identify the even elements in an array

        int []arr= new int[7];
        arr[0]=8;
        arr[1]=3;
        arr[2]=7;
        arr[3]=6;
        arr[4]=21;
        arr[5]=42;
        arr[6]=53;

        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i] +" is even");
            }
            else {
                System.out.println(arr[i] +" is odd");
            }
        }

    }
}
