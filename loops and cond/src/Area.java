import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter radius:");
        float radius = in.nextFloat();
        double area= Math.PI*(radius);
        System.out.println("area if circle is "+area);

    }
}
