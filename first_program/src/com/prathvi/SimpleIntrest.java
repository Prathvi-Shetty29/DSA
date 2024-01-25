package com.prathvi;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int principle,time,rate;
        System.out.println("enter princile, time and rate");
        principle=input.nextInt();
        time=input.nextInt();
        rate=input.nextInt();
        int simple_intrest=(principle*rate*time)/100;
        System.out.println("simple intrest is "+simple_intrest);

    }
}
