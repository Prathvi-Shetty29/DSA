package prathvi;

public class SearchString {
    public static void main(String[] args) {
        String str="asdfghjkl";
        char target='1';
        System.out.println(search(str,target));

    }

    private static boolean search(String str,char target) {
        if(str.length()==0){
            return false;

        }
        for(int i=0;i<str.length();i++){
            if (target== str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
