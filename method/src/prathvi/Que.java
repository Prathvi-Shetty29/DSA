package prathvi;

import java.util.Scanner;

public class Que {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        boolean ans=isPrime(n);
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n<=1)
        {
            return false;

        }
        int c=2;
        while(c*c<=n){
            if(c%n==0)
            {
                return false;
            }
            c++;

        }
        return c * c > n;
    }
}
