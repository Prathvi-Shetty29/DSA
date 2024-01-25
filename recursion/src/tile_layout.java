public class tile_layout {
    public static void main(String[] args) {
        System.out.println(placeTiles(4,2));
    }
    public static int placeTiles(int n,int m){
        if(n == m){
            return 2;
        }
        if (n<m){
            return 1;
        }

        int verPlacements=placeTiles(n-m,m);
        int horPlacements= placeTiles(n-1,m);

        return verPlacements+horPlacements;
    }
}
