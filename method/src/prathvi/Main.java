package prathvi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter num 1");
        int num1=in.nextInt();
        System.out.println("enter num 2");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("sum is "+ sum);
    }
}
