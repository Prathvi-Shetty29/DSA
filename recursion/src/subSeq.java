import java.util.HashSet;

public class subSeq {
    public static void main(String[] args) {
        HashSet<String>set =new HashSet<>();
        subSequence("aab", 0,"",set);
    }
    public static void subSequence(String str,int index, String newString,HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newString)){
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char curChar=str.charAt(index);
        //to do
        subSequence(str,index+1, newString+curChar,set);

        //not to
        subSequence(str,index+1, newString,set);
    }
}
