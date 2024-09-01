import java.util.*;
public class Operators {
    public static void main(String[] args) {
       /* // Get bit operation access the bit at particular position
        int num=5;
        int pos=3;
        int bitMask = 1<<pos;
        int newBitMask = bitMask & num;
        if(newBitMask == 0){
            System.out.println("Bit is Zero");
        }
        else{
            System.out.println("Bit is One");
        }*/

        /*//Set bit operation making bit 1
        int num = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        int newBitMask = bitMask | num;
        System.out.println(newBitMask);*/

        /* //clear bit- operation making bit 0
        int num = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int newBitMask = notBitMask & num;
        System.out.println(newBitMask);

         */

        // update bit - if 0 : set operation if 1 : clear operation
        Scanner sc = new Scanner(System.in);
        int opr = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        if (opr == 1){
            //set operation
            int newBitMask = bitmask | n;
            System.out.println(newBitMask);
        }
        else{
            //Clear operation
            int notBitMask = ~(bitmask);
            int newBit = notBitMask & n;
            System.out.println(newBit);
        }
    }

}
