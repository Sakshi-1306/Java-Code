package Loops_Questions;

import java.util.Scanner;
public class Occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        System.out.print("Number you want to check how many times occur : ");
        int n = in.nextInt();

        int count = 0;

        while ( num > 0) {
            int  rem = num % 10;
            if( rem == n){
                count++;
            }
            num = num / 10;
        }
        System.out.println("count = " + count);

    }
}
