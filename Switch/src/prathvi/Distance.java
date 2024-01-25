package prathvi;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the value of point x-");
        int x1=in.nextInt();
        int y1=in.nextInt();
        System.out.println("enter the value of point y-");
        int x2=in.nextInt();
        int y2=in.nextInt();
        double distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1) *  (y2-y1));
        System.out.println("distance="+distance);



    }
}
