import java.lang.reflect.Array;
import java.util.Arrays;

public class k_mergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length ==1){
            return arr;
        }
        int mid= arr.length /2;
        int []left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return  merge (left,right);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] mx=new int [first.length+ second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< first.length && j<second.length){
            if(first[i]<second[j]){
                mx[k] = first[i];
                i++;
            }else{
                mx[k]= second [j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mx[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mx[k] = second[j];
            j++;
            k++;
        }
        return mx;
    }
}
