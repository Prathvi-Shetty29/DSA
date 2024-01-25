import java.util.Scanner;

public class MIn_Max {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter 3 numbers ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int max=max(a,b,c);
        int min=min(a,b,c);
        System.out.println("max is "+max);
        System.out.println("min is "+min);


    }
    static int max(int a,int b,int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max) {
            max=c;
        }
        return max;
    }
    static int min(int a,int b,int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min) {
            min=c;
        }
        return min;
    }

}
