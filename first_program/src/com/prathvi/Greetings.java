package com.prathvi;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter name-");

        String name= input.nextLine();
        System.out.println("welcome " +name);
    }

}
