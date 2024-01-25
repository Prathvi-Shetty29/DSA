package prathvi;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empid=in.nextInt();
        String dept=in.next();
        switch (empid) {
            case 1 -> System.out.println("xyz");
            case 2 -> System.out.println("abc");
            case 3 -> {
                System.out.println("emp 3");
                switch (dept) {
                    case "it" -> System.out.println("it dept");
                    case "management" -> System.out.println("managemntn dept");
                    default -> System.out.println("no sech dept");
                }
            }
            default -> System.out.println("invalid emp name");
        }
    }
}
