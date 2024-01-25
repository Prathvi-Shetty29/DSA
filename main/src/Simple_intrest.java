import java.util.Scanner;

public class Simple_intrest {
    public static void main(String[] args) {
        int p,t,r;
        Scanner in=new Scanner(System.in);
        System.out.print("enter principle: ");
        p=in.nextInt();
        System.out.print("enter time: ");
        t=in.nextInt();
        System.out.print("enter rate: ");
        r=in.nextInt();
        int simple_intrest=(p*t*r)/100;
        System.out.println("simple intrest is : "+simple_intrest);
    }
}
