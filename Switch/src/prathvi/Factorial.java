package prathvi;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter no-");
        int no = in.nextInt();
        int fact=1;
        for(int i=1;i<=no;i++)
        {
            fact=fact * i;


        }
        System.out.println("factorial="+fact);
    }
}
