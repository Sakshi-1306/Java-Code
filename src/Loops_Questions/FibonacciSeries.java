package Loops_Questions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Till which number you want fibonacci series: ");
        int num = in.nextInt();

        int count = 2;
        int n = 0;
        int n1 = 1;
        int n2 = 1;

        //System.out.print(n+" "+n1+" "+n2+" ");

        while(count < num ){
            n = n1 + n2;
            n1 = n2;
            n2 = n;

            count++;
        }
        System.out.print(n+" ");

    }
}
