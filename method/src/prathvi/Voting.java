package prathvi;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        if(eligible(age)){
            System.out.println("You are elligible to vote");
        }
        else{
            System.out.println("You are not elligible to vote");
        }
        sc.close();
    }
    public static boolean eligible(int age){
        return age >= 18;
    }
}