public class SearchInString {

    public static void main(String[] args) {
        String name="hello";
        char target='h';
        System.out.println(search(name,target));
    }
    static boolean search(String name, char target){
        if(name.length() == 0){
            return false;
        }
        for(char ch:name.toCharArray()){
            if(ch== target){
                return true;
            }
        }
        return false;
    }
    
}
