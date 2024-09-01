public class ReverseStringRecursion {
    public static void ReverseString(String str, int index){
        if(index == -1){
            //System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        ReverseString(str,index-1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        ReverseString(str,str.length()-1);
    }
}
