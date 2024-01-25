package prathvi;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8);
        mulargs(10,29,"asdasad","adadadasd");

    }
    static void mulargs(int a ,int b,String ...v){


    }
    static void fun (int ...v){
        System.out.println(Arrays.toString(v));
    }
}
