package prathvi;

import java.util.ArrayList;

public class ArraylistEg {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>(20);
        list.add(343);
        list.add(343);
        list.add(343);
        list.add(343);
        list.add(343);
        list.add(343);
        list.add(343);
        list.add(343);
        list.add(343);
        list.add(555);
        list.add(343);
        System.out.println(list);
        list.contains(555);
        System.out.println(list.contains(555));
        list.set(0,99);
        System.out.println(list);


    }
}
