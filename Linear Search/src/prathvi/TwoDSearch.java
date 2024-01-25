package prathvi;

public class TwoDSearch {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {44,23,564,24},
                {23432,454,343,2332}
        };
        System.out.println("minimum element is "+min(arr));
    }
    static int min(int[][] arr){
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min)
                    min=arr[i][j];
            }
        }
        return min;

    }
}
