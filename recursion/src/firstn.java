public class firstn {
    public static void main(String[] args) {
        n_sum(1,5,0);
    }
    public static void n_sum(int i,int n,int sum){
        if(i == n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }

        sum =sum+i;
        n_sum(i+1,n, sum);
        System.out.println(i);



    }
}
