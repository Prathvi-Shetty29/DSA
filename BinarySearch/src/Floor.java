public class Floor {
    public static void main(String[] args) {
        int[] arr={12,22,45,67,89,100,102,156,201,300};
        int target=101;
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(arr[middle]>target){
                end=middle - 1;
            }
            if(arr[middle]<target){
                start=middle + 1;
            }
            if(arr[middle] == target){
                return target;
            }
        }
        return arr[start];
    }
}
