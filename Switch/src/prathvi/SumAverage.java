package prathvi;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=in.nextInt();
        System.out.println("enter the elements");
        int sum=0,num;
        for(int i=0;i<n;i++ )
        {
            num=in.nextInt();
            sum=sum+num;


        }
        System.out.println("sum is "+sum);
        double avg=(double) sum/n;
        System.out.println("average is "+ avg);

    }
}
