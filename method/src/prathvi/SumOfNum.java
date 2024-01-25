package prathvi;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter 2 numbers :");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("sum of 2 numbers "+a +" and "+b+" is "+sum(a,b));
        in.close();
    }
    static int sum(int a,int b){

        return a+b;
    }
}
