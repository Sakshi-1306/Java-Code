public class FindOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void StringOccurance(String str, int index, char element){
        if(index == str.length()){
            System.out.println("First Occurance: "+first);
            System.out.println("Last Occurance: "+last);
            return;
        }
        char CurrentChar = str.charAt(index);
        if(CurrentChar == element){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }
        StringOccurance(str,index+1,element);
    }
    // Time Complexity - O(n) - length of the string
    public static void main(String[] args) {
        String str = "abcdaabcadaab";
        StringOccurance(str,0,'a');
    }
}

