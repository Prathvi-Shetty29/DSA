public class party_invites {
    public static void main(String[] args) {
        System.out.println(ways(4));
    }
    public static int ways(int n){
        if(n<=1){
            return 1;
        }
        int ways1=ways(n-1);
        int ways2= (n-1) * ways(n-2);

        return ways1+ways2;
    }
}
