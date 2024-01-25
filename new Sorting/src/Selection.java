import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr={4,5,2,9,0,4,};
        for(int i=0;i< arr.length ; i++){
            int smallest=i;
            for (int j = i+1; j < arr.length ; j++) {

                if(arr[smallest] > arr[j]){
                    smallest=j;
                }

            }
            int temp=arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
