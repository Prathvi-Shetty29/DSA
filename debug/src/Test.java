import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] patterns={"a","abc","bc","d"};
        String word="abc";
        int ans=numOfStrings(patterns,word);
        System.out.println(ans);


    }
    public static int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String p:patterns){
            if(word.contains(p)){
                c++;
            }
        }
        return c;

    }

}
