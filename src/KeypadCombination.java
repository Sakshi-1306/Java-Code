import java.text.CompactNumberFormat;

public class KeypadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void PrintCombination(String str, int index, String Combination){
        if(index == str.length()){
            System.out.println(Combination);
            return;
        }
        char currentChar = str.charAt(index);
        String mapping = keypad[currentChar - '0'];

        for(int i=0; i<mapping.length(); i++){
            PrintCombination(str,index+1, Combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "3";
        PrintCombination(str,0,"");
    }
}
