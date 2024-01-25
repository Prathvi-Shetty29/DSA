package prathvi;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in= new Scanner((System.in));
        System.out.println("enter the 3 numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("largest number is "+largest(a,b,c));
        System.out.println("smallest number is " + smallest(a,b,c));
    }
    static int largest(int a,int b,int c)
    {
        int max=a;
        if(b>max){
            max=b;
        }
        if (c > max){
            max=c;
        }
        return  max;
    }
    static int smallest(int a,int b,int c){
        int min=a;
        if (b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }
}
