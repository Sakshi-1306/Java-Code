package Loops_Questions;

public class ReverseNo {
    public static void main(String[] args) {

        int num = 1212307;
        int temp = num;
        int rev = 0;
        while ( num > 0){
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        System.out.println("Reverse no. = "+rev);

        if(temp == rev){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
