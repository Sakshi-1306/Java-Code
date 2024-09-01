import java.util.Scanner;

public class Main{
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter some input: ");
//        int rollNo = input.nextInt();
//        System.out.println("your roll no is "+rollNo);
        int n = 1342;
         int product = 1;
         int sum = 0;
         while(n > 0){
            int rem = n % 10;
            product = product * rem;
            sum = sum + rem;
            n = n / 10;
         }
        System.out.println(product);
        System.out.println(sum);
    }
}