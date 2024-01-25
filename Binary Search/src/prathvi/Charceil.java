package prathvi;

public class Charceil {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target='d';
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);



    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end = letters.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(target<letters[mid]){
                end=mid-1;
            }else if(target>letters[mid]){
                start=mid+1;

            }
        }
        return letters[start%letters.length];

    }
}

