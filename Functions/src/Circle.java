import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the radius");
        float radius=in.nextFloat();
        System.out.println(circumference(radius));

    }
    static double circumference(float r){
        double c=2*Math.PI*r;
        return c;
    }
}
