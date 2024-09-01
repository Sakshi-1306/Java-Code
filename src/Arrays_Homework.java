import java.util.*;
import java.util.Arrays;
public class Arrays_Homework {
    public static void main(String[] args) {

        //1. Take an array of name as input from the user & print them on the screen.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of names you want to print: ");
//        int size = sc.nextInt();
//        String names[] = new String[size];
//        System.out.println("Enter your name: ");
//        for(int i =0; i<size; i++){
//            names[i] = sc.next();
//        }
//        for(int i=0; i<size; i++){
//            System.out.println("name at "+(i+1)+" is "+names[i]);
//        }

        //2. Print the maximum and minimum numbers in an array of integers.
//        Scanner sc = new Scanner(System.in);
//        // size of an array
//        System.out.print("Enter the size of an array: ");
//        int size = sc.nextInt();
//
//        //declaration of an array
//        int[] numbers=new int[size];
//        System.out.println("Enter the numbers: ");
//        //initialization / or taking the input from the user
//        for(int i=0; i<size; i++){
//            numbers[i] = sc.nextInt();
//        }
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for(int i=0; i<size; i++){
//            if(numbers[i] > max){
//                max = numbers[i];
//            }
//            if(numbers[i] < min){
//                min = numbers[i];
//            }
//        }
//        System.out.println("Maximum Value: "+max);
//        System.out.println("Minimum Value: "+min);

        //3.Print the largest and Second Largest number in an array.
//        int[] numbers = {10,34, 67,30,100,38};
//        int max = Integer.MIN_VALUE;
//        int Second_max = Integer.MIN_VALUE;
//        for (int i=0; i< numbers.length; i++){
//            if(numbers[i] > max){
//                Second_max = max;
//                max = numbers[i];
//            }
//            if(numbers[i] > Second_max && numbers[i] != max){
//                Second_max = numbers[i];
//            }
//        }
//        System.out.println("Maximum value: "+max);
//        System.out.println("Second maximum value: "+Second_max);

        // 4. Take an array of numbers as input and check if it is an ascending order or not.
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] numbers = new int[size];
//        System.out.print("Enter the number:  ");
//        // input
//        for(int i=0; i<size; i++){
//            numbers[i]=sc.nextInt();
//        }
//        boolean isAscending=true;
//        for(int i=0; i<size-1; i++){
//            if(numbers[i] > numbers[i+1]){
//                isAscending=false;
//            }
//        }
//        if(isAscending){
//            System.out.println("Numbers is in ascending order.");
//        }
//        else{
//            System.out.println("Numbers is not in ascending order.");
//        }

        // 5. Reverse a string array
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for(int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }


//        // 6. to check if strings are anagram or not.
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//
//        //convert string into array
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//
//        // sort arrays
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        if(Arrays.equals(arr1,arr2)){
//            System.out.println("String are anagram");
//        }else{
//            System.out.println("String are not anagram");
//        }

        // 7. to check if string is palindrome ar not.
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        String str1 ="";
//        int strLength = str.length();
//        for(int i = strLength-1; i>=0; i--){
//            str1= str1 + str.charAt(i);
//        }
//        System.out.println("reverse string: "+str1);
//        if(str.equalsIgnoreCase(str1)){
//            System.out.println("String is palindrome");
//        }else{
//            System.out.println("String is not palindrome");
//        }

        // 8. To check number is palindrome or not
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int temp = num;
//        int rev = 0;
//        while(num != 0){
//            int rem = num % 10;
//            rev = (rev*10) + rem;
//            num = num/10;
//        }
//        System.out.println(rev);
//        if (temp == rev){
//            System.out.println("Number is palindrome");
//        }else{
//            System.out.println("number is not palindrome");
//        }
    }
}
