package com.prathvi;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.println("enter no ");
        a=input.nextInt();
        if(a%2==0)
            System.out.println("no " + a + " is even");

            else
            {
                System.out.println("no "+a+"is odd");
            }
        }
    }

