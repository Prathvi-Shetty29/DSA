import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the string: ");
        String str=in.nextLine();
        boolean ispalin = true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!= str.charAt(str.length()-i-1)){
                ispalin=false;
                break;
            }
        }
        if(ispalin){
            System.out.println(str+(" is a palindrome"));
        }
        else {
            System.out.println(str+(" is a not palindrome"));

        }

    }
}
