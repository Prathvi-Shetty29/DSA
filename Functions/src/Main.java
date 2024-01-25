import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//        int sum=rsum();
//        System.out.println(sum);
        int sum=sum33(10,20);
        System.out.println(sum);
    }
    static int sum33(int a,int b){
        int c=a+b;
        return c;
    }
    static int rsum(){
        Scanner in =new Scanner(System.in);
        System.out.print("enter first number:");
        int num1=in.nextInt();
        System.out.print("enter 2nd number:");
        int num2=in.nextInt();
        int sum=num1+num2;

        return sum;
    }
     static void sum (){
         Scanner in =new Scanner(System.in);
        System.out.print("enter first number:");
        int num1=in.nextInt();
         System.out.print("enter 2nd number:");
         int num2=in.nextInt();
         int sum=num1+num2;
         System.out.println("the total sum is "+sum);
    }


}
