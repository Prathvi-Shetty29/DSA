import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
   //     int num = (int) 60.00f;
        byte b=42;
        char c='a';
        short s=1024;
        int i = 50000;
        float f=5.6f;
        double d= 0.1234;
        double result= (f*b)+(i/c)-(d-s);
        System.out.println((f*b)+" "+(i/c)+" " +(d-s));
        System.out.println(result);
        ;


    }
}
