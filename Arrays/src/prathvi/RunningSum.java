package prathvi;
class Solution {
    public static void main(String[] args) {

    }
    public int[] runningSum(int[] nums) {
        nums=new int{1,2,3,4} ;

        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;

    }
}