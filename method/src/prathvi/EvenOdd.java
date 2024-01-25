package prathvi;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number");
        int num=in.nextInt();
        evenodd(num);
    }
    static void evenodd(int num){
        if(num % 2==0){
            System.out.println("the number is even");

        }
        else {
            System.out.println("the number is odd");
        }
    }
}
