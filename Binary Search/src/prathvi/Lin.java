package prathvi;

import java.util.Arrays;

public class Lin {
    public static void main(String[] args) {
        int [] arr={3,7,7,7,7,8,8,10};
        int target=7;
        System.out.println(Arrays.toString(index(arr,target)));

    }
    static int[] index(int[] arr,int target){
        int[] ans={-1,-1};
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                ans[0]=i;
                break;
            }

        }
        for(int i= arr.length-1;i>= 0;i--){
            if(arr[i]==target){
                arr[1]=i;
                break;
            }
            else{
                arr[1]=-1;
            }
        }
        return ans;

    }
}
