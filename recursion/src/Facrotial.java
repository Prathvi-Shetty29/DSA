public class Facrotial {
    public static void main(String[] args) {
        System.out.println(find_factorial(5));

    }
    public static int find_factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1=find_factorial(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }
}
