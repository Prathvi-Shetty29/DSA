package prathvi;

import java.util.Scanner;

public class AreaCircum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter radius of circle");
        double radius=in.nextFloat();

        System.out.println("area of circle :"+area(radius));
        System.out.println("circumference of circle :"+circum(radius));


    }

    private static double circum(double radius) {
        double circum=2 *Math.PI*radius;
        return circum;
    }

    static double area(double radius){
        double area;
        area = Math.PI*radius*radius;


        return area;

    }
}
