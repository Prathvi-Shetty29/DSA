public class towerOfH {
    public static void main(String[] args) {
        int n= 3;
        towarOfHanoi(n, "S","H","D");
    }
    public static void towarOfHanoi(int n, String src,String hlp,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+ " to destination " +dest);
            return;
        }
        towarOfHanoi(n-1, src,dest,hlp);

        System.out.println("Transfer disk "+n+" from "+src+ " to destination " +dest);
        towarOfHanoi(n-1,hlp,src,dest);
    }
}
