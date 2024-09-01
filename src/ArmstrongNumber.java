import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        for(int i = 100; i <= 10000; i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int temp = n;
        int length = (int)(Math.log10(n)+1);
        int sum = 0;
        while(n > 0){
           int rem = n % 10;
           int power = 1;
           for(int i = 1; i <= length; i++){
               power = rem * power;
           }
           n /= 10;
           sum += power;
        }
       return sum == temp;
    }
}
