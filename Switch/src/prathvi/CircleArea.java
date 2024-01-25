package prathvi;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter radius-");
        float radius=in.nextFloat();
        float area= (float) (Math.PI * (radius * radius));
        System.out.println("area is "+area);

    }

}
