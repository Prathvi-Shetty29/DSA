import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit=in.nextLine();

//        switch (fruit) {
//            case "apple" -> System.out.println("apple");
//            case "mango" -> System.out.println("mango");
//            default -> System.out.println("enter valid fruit");
//        }
//        switch (fruit){
//            case "pineapple"-> System.out.println("pineapple");
//        }
        int day=4;
        switch (day){
            case 1,2,3,4,5-> System.out.println("weekday");
            case 6,7-> System.out.println("weekend");
        }



    }
}
