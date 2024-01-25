public class keypad {
    public static String[] keypad={".","abc", "def","gfi","jlk","mno","pqr","tu","vwx","yz"};

    public static void main(String[] args) {
        String str="4";
        sequence(str,0,"");
    }
    public static void sequence(String str, int index, String combination){
        if(index == str.length()){
            System.out.println(combination);
            return;
        }

        char curChar= str.charAt(index);
        String mapping = keypad[curChar- '0'];
        for(int i=0;i<mapping.length();i++){
            sequence(str ,index+1, combination+mapping.charAt(i));
        }
    }
}
