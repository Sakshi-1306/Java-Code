import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any number: ");
        int n= sc.nextInt();
        boolean Prime = true;
        for(int i=2; i<n; i++){
             if (n%i == 0){
                Prime = false;
                break;
            }
        }
        if (n == 0 || n == 1){
            System.out.println("Given number is 0 or 1");
        }
        else if (Prime == true){
            System.out.println("Given number is prime number");
        }
        else{
            System.out.println("Given number is not prime number");
        }

    }
}
