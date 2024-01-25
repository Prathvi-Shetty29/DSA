package prathvi;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your marks :");
        float marks=in.nextFloat();
        System.out.println("your grade is "+grade(marks));
    }
    static String grade(float marks) {
        String grade = null;
        if (marks >= 91 && marks <= 100) {
            grade = "AA";
        }
        if (marks >= 81 && marks <= 90) {
            grade = "AB";
        }
        if (marks >= 71 && marks <= 80) {
            grade = "BB";
        }
        if (marks >= 61 && marks <= 70) {
            grade = "BC";
        }
        if (marks >= 51 && marks <= 60) {
            grade = "CD";
        }
        if (marks >= 41 && marks <= 50) {
            grade = "AA";
        }
        if (marks <= 40) {
            grade = "Fail";
        }
        return grade;
    }


    }

