import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("enter a number to check: ");
        int number= num.nextInt();
        if(number%2 == 0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }






    }
}
