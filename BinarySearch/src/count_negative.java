public class count_negative {
    public static void main(String[] args) {
        int [][]arr={
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {-1,-1,-2,-3}
        };
        int count;
        count = countNegatives(arr);
        System.out.println(count);

    }
    public static int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count =0;
        for(int i=0; i<m ;i++){
            count += (n-binarysearch(grid[i]));
        }
        return count;

    }
    public static int binarysearch(int arr[]){
        int start=0;
        int end =arr.length -1;
        while(start<=end){
            int mid=start+(end - start ) /2;
            if(arr[mid]<0){
                end= mid-1;
            }
            else{
                start =mid+1;
            }
        }
        return start;
    }
}
