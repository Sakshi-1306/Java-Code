import java.util.*;
public class Recursion {
    // Q1. Print numbers from 5 to 1.
    /* public static void PrintNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        PrintNum(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        PrintNum(n);
    } */

    // Q2. Print numbers from 1 to 5.
   /* public static void PrintNum(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        PrintNum(n+1);
    }

    public static void main(String[] args) {
        int n = 1;
        PrintNum(n);
    } */

    // Q3. Print the sum of first natural numbers.
    /* public static void PrintSum(int n, int i, int sum){
        if(i == n){
            sum = sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        PrintSum(n,i+1,sum);
    }

    public static void main(String[] args) {
        PrintSum(7,1,0);
    } */

    // Q4. Print factorial of n number.
    /* public static int CalFact(int n){
        if ( n == 1 || n == 0){
            return 1;
        }
        return n * CalFact(n-1);

    }
    public static void main(String[] args) {
        int n = 5;
        int ans = CalFact(n);
        System.out.println(ans);
    } */

    // Q5. Print the fibonacci series till nth term.
    public static void CalFibonacci(int a , int b, int n){
        if ( n == 0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        CalFibonacci(b,c,n-1);
    }

    public static void main(String[] args) {
        int n = 7;
        int a = 0, b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        CalFibonacci(a,b,n-2);
    }

    // Q6. Print x^n (with stack height n)
    /* public static int PrintPower(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return x * PrintPower(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = PrintPower(x,n);
        System.out.println(ans);
    } */

    // Q7. Print x^n (with stack height log2n)
    /* public static int PrintPower(int x, int n){
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if ( n % 2 == 0){ // if n is even
           return PrintPower(x , n/2) * PrintPower(x, n/2);
        }
        else{ // if n is odd
            return  x * PrintPower(x , n/2) * PrintPower(x, n/2);
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x : ");
        int x = sc.nextInt();

        System.out.print("Enter the power of x: ");
        int n = sc.nextInt();

        int ans = PrintPower(x,n);
        System.out.println(ans);
    } */
}