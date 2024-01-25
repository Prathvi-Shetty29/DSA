package prathvi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Samp {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        System.out.println(majorityElement(nums));
        List lis=new ArrayList();




    }

   static public int majorityElement(int[] nums) {
        int majoritycount = nums.length / 2;
        for (int num : nums) {
            int count = 0;
            for (int element : nums) {
                if (element == num) {
                    count++;
                }
            }
            if (count > majoritycount) {
                return num;
            }
        }

        return -1;
    }
}