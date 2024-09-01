import java.util.*;
public class String_Exercise {
    public static void main(String[] args) {

        // 1. Take an array of string from the user & find the cumulative length of all those string.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of a string array: ");
        int size = sc.nextInt();

        String[] names = new String[size];
        int length = 0;
        for(int i=0; i<size; i++){
            names[i]=sc.nextLine();
            length = length + names[i].length();
        }
        System.out.println(length);


        /* 2. Input a string from the user. Create a new string called 'result'
        in which you will replace the letter 'e' in the original string with letter 'i'.*/

       /* Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        String result = "";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'e'){
                result = result + 'i';
            }
            else{
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);

        */

    }
}
