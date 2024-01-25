package prathvi;

public class MInNum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,-7,-2,-99};
        System.out.println("the minimum number in the array is "+min(arr));
    }
    static int min(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
            }
        }
        return min;
    }
}
