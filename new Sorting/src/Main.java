import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,8,90,101,70};
        for(int i=0; i< arr.length; i++){
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}