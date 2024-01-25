package prathvi;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       // String fruit=in.nextLine();
//        if(fruit.equals("mango")){
//            System.out.println("king of fruit");
//
//        }
//        if(fruit.equals("apple")){
//            System.out.println("red fruit");
//        }


//        switch (fruit) {
//            case "mango":
//                System.out.println("yellow");
//                break;
//            case "apple":
//                System.out.println("red");
//                break;
//            case "kiwi":
//                System.out.println("green");
//                break;
//            default:
//                System.out.println("invalid");
//                break;
//        }
        int day=in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
