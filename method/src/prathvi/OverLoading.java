package prathvi;

public class OverLoading {
    public static void main(String[] args) {
        fun(10);
        fun("sdfsdf");

    }
    static  void fun(int b){
        System.out.println(b);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
