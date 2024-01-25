package prathvi;

public class Countnum {
    public static void main(String[] args) {
        int n=23244334,count=0;
        while(n>0){
            int rem=n % 10;
            if(rem == 4)
            {
                count++;


            }
            n=n / 10;


        }
        System.out.println("no of 4="+count);
    }
}
