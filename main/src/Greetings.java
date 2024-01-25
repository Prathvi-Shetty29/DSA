import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter name: ");

        System.out.println("welcome "+ in.nextLine());
    }
}
