package Loops_Questions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abc";
        // iterating string using charAt method
//        for (int i = str.length()-1; i >= 0; i--) {
//            System.out.print(str.charAt(i));
//        }

        // Converting string to char array
        char[] arr = str.toCharArray();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
