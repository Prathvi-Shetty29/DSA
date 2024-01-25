package prathvi;

import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int[] arr={1 ,3 ,23 ,9,18 };
        System.out.println("size="+arr.length);

        System.out.println("the biggest number in the array is-"+max(arr));
        System.out.println("the biggest number in the array is-"+maxRange(arr,3,4));
    }

    static int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    static int maxRange(int[] arr,int start ,int end) {


        int max = arr[start];
        for (int i = start; i <=end ; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
