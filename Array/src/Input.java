import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        int[] arr=new int[5];
//        arr[0]=23;
//        arr[1]=20;
//        arr[2]=235450;
//        arr[3]=23420;
//        arr[4]=220;
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]=in.nextInt();
//
//        }
//        for (int num:arr){
//            System.out.println(num);
//        }
        String[] str=new String[4];
        for (int i = 0; i <  str.length;i++) {
            str[i]=in.next();

        }
        System.out.println(Arrays.toString(str));


    }

}
