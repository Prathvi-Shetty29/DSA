public class R_Duplicates {
    public static boolean[] map=new boolean[26];
    public static void main(String[] args) {
        removeDuplicates("abbcdaa",0 , "");

    }
    public static void removeDuplicates(String str,int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        char curChar=str.charAt(index);
        if(map[curChar - 'a']){
            removeDuplicates(str,index+1,newString);

        }else{
            newString +=curChar;
            map[curChar - 'a']=true;
            removeDuplicates(str,index+1,newString);
        }
    }
}
