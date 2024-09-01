import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class AssignmentQuestion {
    // Q. 1] Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int sum = 0;
//        int n;
//        System.out.println("Press 0 to stop");
//        System.out.print("Enter numbers: ");
//        do{
//            n = in.nextInt();
//            sum += n;
//        } while(n > 0);
//        System.out.println("Sum : "+sum);
//    }

//    // Q.2] Take integer inputs till the user enters 0 and print the largest number from all.
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n;
//        int max = Integer.MIN_VALUE;
//        System.out.println("Press 0 to stop");
//        System.out.print("enter number: ");
//        do{
//            n = in.nextInt();
//            if(n > max){
//                max = n;
//            }
//        } while (n > 0);
//        System.out.println("Greatest  Number: "+max);
//    }

    // Factorial program in java
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
