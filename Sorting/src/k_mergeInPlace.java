import java.util.Arrays;

public class k_mergeInPlace {
    public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
    divide(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void divide(int[] arr,int start,int end){
        if(start >=end){
            return;
        }
        int mid=start +(end- start) / 2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);

        merge(arr,start,mid,end);

    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] mix= new int[end -start +1];
        int i=start;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=end){
            if(arr[i] <= arr[j]){
                mix[k++] = arr[i++];
            }
            else{
                mix[k++] = arr[j++];
            }
        }
        while(i<=mid){
            mix[k++] = arr[i++];
        }
        while(j<=end){
            mix[k++] = arr[j++];
        }
        for(int ii=0,jj=start; ii<mix.length;ii++,jj++){
            arr[jj]=mix[ii];
        }


        }

    }



