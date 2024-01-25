package prathvi;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            int a=10;
//
//            arr[i] = i;
//            System.out.print(arr[i] + " ");
//
//        }
//            for (int num:arr){
//                System.out.println(Arrays.toString(arr));
//            }
//        System.out.println(Arrays.toString(arr));

            //array of objects
        String[] str=new String[5];
        for (int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));




    }


    }



