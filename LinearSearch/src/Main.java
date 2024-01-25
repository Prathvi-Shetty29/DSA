public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=5;
        int ans=(linersearch(arr,target));
        System.out.println(ans);
    }
    static int linersearch(int [] arr,int target){
        if(arr.length == 0){
            return -1;

        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target){
                return index;
            }

        }
        return -1;
    }
}
