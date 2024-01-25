import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter a number:");
        int fact = in.nextInt();
        System.out.println(factorial(fact));

    }
    static int factorial(int f){
        int fact=1;
        while (f>0){
            fact=fact*f;
            f--;
        }
        return fact;

    }
}
