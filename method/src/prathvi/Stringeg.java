package prathvi;

import java.util.Scanner;

public class Stringeg {
    public static void main(String[] args) {
      //  String message = greet();
      //  System.out.println(message);
        Scanner in =new Scanner(System.in);
        System.out.println("enter your name");
        String name=in.next();

        String  personalized = myGreet(name);
        System.out.println(personalized);
    }

    private static String myGreet(String name) {
        String message="hello " +name;
        return message;

    }

    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}

