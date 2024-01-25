import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxindex=getmax(arr,0,last);
            swap(arr,maxindex,last);




        }
    }
    static  void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    static int getmax(int[] arr,int first,int last){
        int max=first;
        for (int i = first; i <= last; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }

        }
        return max;

    }

}