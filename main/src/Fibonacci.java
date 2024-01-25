import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        int num1 = 0, num2 = 1;
        System.out.print(num1 + " " + num2);

        for (int i = 2; i < n; i++) {
            int nextNum = num1 + num2;
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }
}
