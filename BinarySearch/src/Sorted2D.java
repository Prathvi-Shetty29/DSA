public class Sorted2D {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8}
        };
        System.out.println(arr[1].length);

    }
    static int[] binarysearch(int[][] matrix,int row,int cstart,int cend, int target ){
        while(cstart<= cend){
            int mid=cstart + (cend - cstart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }if (matrix[row][mid]<target){
                cstart =mid + 1;
            }else{
                cend = mid -1;
            }

        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix , int target){
        int rows = matrix.length;
        int cols=matrix[0].length;

        if(rows == 1){
            return binarysearch(matrix,0,0,cols -1 ,target);
        }
        int rowStart=0;
        int rowEnd=rows-1;
        int cMid=cols/2;
        while(rowStart < (rowEnd - 1)){
         int mid=rowStart+(rowEnd - rowStart) /2;
     //    if[matrix]
        }
        return new int[]{-1,-1};
    }

}
