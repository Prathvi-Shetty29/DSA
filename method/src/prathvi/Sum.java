package prathvi;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

     //   int ans=sum2();
       // System.out.println(ans);
        int ans =sum3(20,30);
        System.out.println(ans);


    }
    // pass the values numbers when you are calling the method in main()
    static int sum3(int a,int b){
        int num=a+b;
        return num;
    }
    static int sum2(){
        Scanner in =new Scanner(System.in);
        System.out.println("enter num 1");
        int num1=in.nextInt();
        System.out.println("enter num 2");
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;

    }
    static void sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter num 1");
        int num1=in.nextInt();
        System.out.println("enter num 2");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("sum is "+ sum);
    }
}
