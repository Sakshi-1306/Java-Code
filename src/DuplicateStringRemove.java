import java.util.Currency;

public class DuplicateStringRemove {
    // there are 26 alphabets in english so, we create boolean map of 26 size.
    public static boolean[] map = new boolean[26];

    public static void RemoveDuplicate(String str, int index, String newString){
        if(index == str.length()){
            System.out.println("Unique Character: "+newString);
            return;
        }
        char currentChar = str.charAt(index);
        if(map[currentChar - 'a']){
            RemoveDuplicate(str,index+1,newString);
        }
        else{
            newString += currentChar;
            map[currentChar - 'a'] = true;
            RemoveDuplicate(str, index+1,newString);
        }
    }

    // Time Complexity - O(n) - Traverse the length of the string
    public static void main(String[] args) {
        String str = "naina";
        RemoveDuplicate(str,0,"");
    }
}
