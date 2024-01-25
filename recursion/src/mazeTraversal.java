public class mazeTraversal {
    public static void main(String[] args) {
        int paths=totalPaths(0,0,3,3);
        System.out.println(paths);
    }
    public static int totalPaths(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int totalrights=totalPaths(i,j+1,n,m);
        int totaldown=totalPaths(i+1,j,n,m);

        return totaldown+totalrights;
    }
}
