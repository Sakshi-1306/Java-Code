import java.util.*;
public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0 //need a single inverted coma
        sb.setCharAt(0,'S');
        System.out.println(sb);

        //Insert function
        sb.insert(1,'p');
        System.out.println(sb);

        sb.insert(2,'o');
        System.out.println(sb);

        //delete function
        sb.delete(2,3);
        System.out.println(sb);

        sb.delete(0,1);
        System.out.println(sb);

        //append function
        sb.append("T");
        sb.append("a");
        sb.append("i");
        sb.append("l");
        System.out.println(sb);

        //length function
        System.out.println(sb.length());

        //Exercise - 1.reverse string Logic-1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
//        String rev = "";
//        for(int i=str.length()-1;i>=0;i--){
//            rev = rev + str.charAt(i);
//        }
//        System.out.println(rev);

        //Logic-2
        char[] arr = str.toCharArray();
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
