import java.util.Scanner;

    public class asd {
        public static class Solution {

            public static void main(String[] args) {
                // Write your code here
                Scanner in =new Scanner( System.in);
                System.out.println("enter input ");
                String ch = in.nextLine();
                char c=ch.charAt(0);
                if (c >= 'A' && c <= 'Z') {
                    System.out.println("1");
                } else if (c >= 'a' && c <= 'z') {
                    System.out.println("0");
                } else {
                    System.out.println("-1");
                }


            }
        }
    }


