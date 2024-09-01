import java.util.*;
public class ExerciseFunction {
    //1. Enter three numbers from the user & make a function to their average.
//    public static void Average(int a, int b, int c){
//        double avg = (a+b+c) / 3;
//        System.out.println("Average of the three numbers: "+avg);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        Average(a, b, c);
//    }

    // 2. Write a function to print the sum of odd numbers from 1 to n.
//    public static void OddSum(int n){
//        int sum = 0;
//        for(int i=1; i<=n; i++){
//            if (i % 2 != 0){
//                sum = sum+i;
//            }
//        }
//        System.out.println(sum);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int n = sc.nextInt();
//        OddSum(n);
//
//    }

    //3.write a function which takes in two numbers and returns the greater of those two numbers.
//    public static void GreaterNumber(int a, int b){
//        if (a == b){
//            System.out.println(a+"and" +b+"both are equal.");
//        }
//        else if (a > b){
//            System.out.println(a+" is greater than "+b);
//        }
//        else{
//            System.out.println(b+" is greater than "+a);
//        }
//    }
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       GreaterNumber(a ,b);
//    }

    //4. Write a function that takes the radius as the input and return the circumference of circle.
//    public static double CircumferenceOfCircle(double r){
//        double pi = 3.14;
//        double result = 2*pi*r;
//        return result;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the radius of circle: ");
//        double r = sc.nextDouble();
//        double result = CircumferenceOfCircle(r);
//        System.out.println("Circumference of circle: "+result);
//    }

    //5. write a function that takes in age as input and returns if that person is eligible to vote or not.
//    public static void EligibleVote(int age){
//        if (age < 18){
//            System.out.println("The person is not eligible to vote.");
//        }else{
//            System.out.println("The person is eligible to vote.");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        EligibleVote(age);
//    }

    //6. write an infinite loop using do while condition.
//    public static void main(String[] args) {
//        int n=2;
//        int i = 1;
//        do{
//            System.out.println("hello world");
//            i--;
//        }while(i<n);
//    }

    //7. Write a program to enter the numbers to the numbers till the user wants and at the end it should display
    // the count of positive and negative and zero entered.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the total numbers you want to enter: ");
//        int total = sc.nextInt();
//        System.out.println("Enter the numbers: ");
//        int num ;
//        int positive =0;
//        int negative = 0;
//        int zero = 0;
//        for(int i = 0; i<total; i++){
//            num = sc.nextInt();
//            if (num == 0){
//                zero++;
//            } else if (num > 0) {
//                positive++;
//            } else {
//                negative++;
//            }
//        }
//        System.out.println("Positive: "+positive);
//        System.out.println("Negative: "+negative);
//        System.out.println("Zero: "+zero);
//    }

    //8.Two numbers are entered by the user x and n.
    // write a function to find the value of one number raised to the power of another i.e x^n
//    public static void Power(int x , int n){
//        int power = x;
//        for(int i = 1; i<n; i++){
//            power = power*x;
//        }
//        System.out.println("Power of "+x+" raised to "+n+": "+power);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value of x and n (x^n): ");
//        int x = sc.nextInt();
//        int n = sc.nextInt();
//
//        Power(x, n);
//    }

    //9. Write a function that calculates the greatest common divisor of two numbers.
//    public static int GreatestCommonDivisor(int x , int y){
//        int gcd = 1;
//        for (int i = 2; i<=x && i<=y; i++ ){
//            if (x%i==0 && y%i==0){
//                gcd =i;
//            }
//        }
//        return gcd;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter two numbers: ");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int gcd = GreatestCommonDivisor(x,y);
//        System.out.println("Greatest Common Divisor of "+x+" and "+y+": "+gcd);
//    }

    //10. Write a program to print Fibonacci series till n.
    public static void Fibonacci(int n){
        int i=3,n1=0, n2 =1, n3=0;
        System.out.print(n1+" "+n2);
        while (i <= n){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you want a fibonacci series: ");
        int n = sc.nextInt();
         Fibonacci(n);

    }
}
