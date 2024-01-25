import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int num1,num2,num3=0;
        Scanner in= new Scanner(System.in);
        char op;
        System.out.print("enter 2 numbers: ");
        num1=in.nextInt();
        num2=in.nextInt();
        System.out.println("enter operation: ");
        op=in.next().charAt(0);
        if(op=='+') {
            num3 = num1 + num2;

        } else if (op=='-') {
            num3=num1-num2;
        }
        else if (op=='*') {
            num3=num1*num2;
        }
        else if (op=='/') {
            num3=num1/num2;
        }
        System.out.println("the result is : "+ num3);
    }
}
