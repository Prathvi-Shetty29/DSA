import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);// initial capacity optional
        Scanner in =new Scanner(System.in);
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);list.add(10);
        for (int i = 0; i < 5 ; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }






    }

}
