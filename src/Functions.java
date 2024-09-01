import java.util.*;
public class Functions{
    //check number is prime or not
//    public static boolean PrimeNumber(int n){
//        boolean IsPrime = true;
//        for(int i=2; i<n; i++){
//            if (n % i == 0){
//                IsPrime=false;
//                break;
//            }
//        }
//        if (n==1 || n==0){
//            return false;
//        }
//        else if (IsPrime){
//            return IsPrime;
//        }else{
//            return IsPrime;
//        }
//    }

    //print factorial
//    public static void Factorial(int n) {
//        if (n < 0) {
//            System.out.println("Invalid number");
//        } else {
//            int fact = 1;
//            for (int i = n; i >= 1; i--) {
//                fact = fact * i;
//            }
//            System.out.println(fact);
//        }
//    }

    // check given number is even or odd
//    public static void EvenOdd(int n){
//        if (n < 0 || n==0){
//            System.out.println("Given number is 0 or else less than 0");
//        }
//        else if (n % 2 == 0){
//            System.out.println("Given number is even");
//        }
//        else{
//            System.out.println("Given number is odd");
//        }
//    }

    //make a function to print the table of given number
    public static void Table(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+"*"+i+":"+n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        //call function for prime number
//         boolean IsPrime = PrimeNumber(n);
//         if(IsPrime){
//             System.out.println("Given number is prime number");
//         }
//         else{
//             System.out.println("Given number is not prime number");
//         }
        // call function for factorial number
         //Factorial(n);
        // call function for EvenOdd number
        //EvenOdd(n);
        Table(n);

    }

}