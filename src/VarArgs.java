import java.lang.reflect.Array;
import java.util.Arrays;
// Taking variable length argument
public class VarArgs {
    public static void main(String[] args) {
//        func();
//        multipleArgs(2,'h',"rahul","kunal","Rushikesh");

        // function overloading - When you didn't pass any argument compile get confused which function to be run.

        demo(1 ,5,3,6);
    }

    static void func(int ...a){
        System.out.println(Arrays.toString(a));
    }
    // this variable length argument must be in the last
    static void multipleArgs(int a, char c , String ...v){
        System.out.println(a+ " "+c+" "+ Arrays.toString(v));
    }

    // here, function overloading
    static void demo(String ...v){
        System.out.println("Function with String argument");
        System.out.println(Arrays.toString(v));
    }

    static void demo(int ...v){
        System.out.println("Function with Integer argument");
        System.out.println(Arrays.toString(v));
    }
}
