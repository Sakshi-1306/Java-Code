import java.util.HashSet;

public class UniqueSubsequence {
    public static void Uniquesubsequence(String str, int index, String newString, HashSet<String> set){
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char CurrentChar = str.charAt(index);

        // to be
        Uniquesubsequence(str,index+1,newString+CurrentChar,set);

        // not to be
        Uniquesubsequence(str,index+1,newString,set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        Uniquesubsequence(str,0,"",set);
    }
}
