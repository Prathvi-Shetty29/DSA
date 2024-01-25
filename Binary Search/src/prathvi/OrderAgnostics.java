package prathvi;

public class OrderAgnostics {
    public static void main(String[] args) {


    }
    static int order(int[] arr,int target){
        boolean isacs;

        int start=0;
        int end= arr.length-1;
        if(arr[start]<arr[end]){
            isacs=true;
        }else {
            isacs=false;
        }
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(target < arr[mid]){
                end=mid-1;
            } else if (target > arr[mid]) {
                start=mid+1;


            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
