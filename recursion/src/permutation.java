public class permutation {
    public static void main(String[] args) {
        printPermutation("abc","");
    }
    static void printPermutation(String str,String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i < str.length(); i++){
            char curCHar=str.charAt(i);
            String newstr=str.substring(0,i) + str.substring(i+1);
            printPermutation(newstr,permutation+curCHar);
        }
    }
}
