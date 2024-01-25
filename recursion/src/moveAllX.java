public class moveAllX {
    public static void main(String[] args) {
        movex("abxcxxxd",0,0,"");

    }
    public static void movex(String str,int index,int count,String newString){
        if(index == str.length()){
            for(int i=0;i<count ; i++){
                newString +='x';
            }
            System.out.println(newString);
            return;
        }

        char curChar=str.charAt(index);
        if(curChar=='x'){
            count++;
            movex( str, index+1, count, newString);

        }else{
            newString += curChar;
            movex( str, index+1, count, newString);
        }
    }
}
