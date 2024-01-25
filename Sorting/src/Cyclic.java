import java.lang.reflect.Array;
import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int [] arr){
        int i=0;
        while(i<arr.length){
            int correct_index=arr[i]-1;
            if(arr[i]!=arr[correct_index]){
                swap(arr,i,correct_index);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first ,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
