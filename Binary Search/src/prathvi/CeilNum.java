package prathvi;
public class CeilNum {
    public static void main(String[] args) {

        int[] arr={-10,-8,-6,2,3,4,15,16,18};
        int ans=binarysearch(arr,5);
        System.out.println(ans);

    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(target < arr[mid]){
                end=mid-1;
            } else if (target > arr[mid]) {
                start=mid+1;


            }
            else {
                return arr[mid];

            }
        }
        return arr[start];

    }
}