public class first_last {
    public static int first=-1;
    public static int last=-1;

    public static void main(String[] args) {
        findOccurance("abaacdaefaah",0, 'a');

    }
    public static void findOccurance(String str,int index, char element){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if(str.charAt(index) == element){
            if(first == -1){
                first=index;
            }else{
                last=index;
            }
        }
        findOccurance(str,index+1,element);
    }

}
