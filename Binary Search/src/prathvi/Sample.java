package prathvi;

public class Sample {
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=3;

        System.out.println(removeElement(nums,val));

    }
    static int[] removeElement(int[] nums, int val) {
        int[] ans=new int[nums.length];
        int i=0;
        for(int n:nums){
            if(n!=val){
                nums[i++]=n;

            }
        }
        return nums;

    }
}
