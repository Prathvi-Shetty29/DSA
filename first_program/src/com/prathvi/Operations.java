package com.prathvi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int result=0;
        System.out.println("enter first no ");
        int num1=input.nextInt();
        System.out.println("enter second no");
        int num2=input.nextInt();
        System.out.println("enter operant +,-,/,*");
        String operator=input.next();
        if (operator.equals("+"))   {
            result=num1+num2;


        } else if (operator.equals("-")) {
            result=num1-num2;
        } else if (operator.equals("*")) {
            result=num1*num2;

        }
        else if (operator.equals("/")) {
            result=num1/num2;
        }
        System.out.println("result=" + result);

    }
}
