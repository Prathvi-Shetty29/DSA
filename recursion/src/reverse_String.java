public class reverse_String {

    public static void main(String[] args) {
        String str="abcd";
            reverse(str,str.length() -1);
    }
    public static void reverse(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }


        System.out.print(str.charAt(idx));
        reverse(str,idx-1);
    }
}
