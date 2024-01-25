public class isSorted {
    public static void main(String[] args) {
        int[] arr= {1,2,3,3};
        System.out.println(issorted(arr,0));
    }
    public static boolean issorted(int[] arr,int index){
        if(index == arr.length -1){
            return true;
        }
        if(arr[index] < arr[index+1]){
            return issorted(arr,index+1);
        }else{
            return false;
        }
    }
}
