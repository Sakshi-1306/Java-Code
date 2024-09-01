import java.util.Arrays;

public class Functions_Basic {

    public static void main(String[] args) {
        // when we changing the value of array by the num object . it will also change the original one.
       int[] arr = {1 ,2,3,4,5};
       int[] num = arr;
        System.out.println(arr[0]);
       num[0] = 0;
        System.out.println(Arrays.toString(arr));

        // it will not chnage the original one
        int a = 10;
        greet(a);
        System.out.println(a);
    }

    static void greet(int num) {
        System.out.println(num);// num = 10
        num = 20; // num = 10
        System.out.println(num);
    }


}
