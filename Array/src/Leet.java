import java.util.Arrays;

public class Leet {
    public static void main(String[] args) {
        int[] ans=new int[2];
        int[] nums={5,7,7,8,8,8,8,8,8,10};
        int target=8;
        ans[0] = first_index(nums,target);
        ans[1] = last_index(nums,target);
        System.out.println(Arrays.toString(ans));

    }

    public static  int first_index(int[] nums, int target){
        int index=-1;
        int start=0;
        int end =nums.length-1;

        while(start<=end){
            int mid=start+(end - start )/2;
            if(nums[mid]>=target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            if(nums[mid]== target){
                index=mid;
            }
        }
        return index;

    }
    public static int last_index(int[] nums , int target){
        int index=-1;
        int start=0;
        int end =nums.length-1;

        while(start<=end){
            int mid=start+(end - start )/2;
            if(nums[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            if(nums[mid]== target){
                index=mid;
            }
        }
        return index;
    }
}


