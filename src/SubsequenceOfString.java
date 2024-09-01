// VERY MUCH IMPORTANT FOR PLACEMENT

public class SubsequenceOfString {
    public static void Subsequence(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char CurrentChar = str.charAt(index);

        // to be
        Subsequence(str,index+1,newString+CurrentChar);

        // or not to be
        Subsequence(str,index+1,newString);
    }
    // Time Complexity - O(2^n) as a subsequences are 2^3

    public static void main(String[] args) {
        String str = "abc";
        Subsequence(str,0,"");
    }
}
