import java.util.*;
public class Arrays {
    public static void main(String[] args) {
//       // Declaration of an array. there are 3 ways
//         int [] marks = new int[3];
//         // int marks[] = new int[3];
//         //int marks[]={96,98,97};
//        marks[0]=98;
//        marks[1]=92;
//        marks[2]=90;
//        //System.out.println(marks); // garbage value (class name + hash code will be print, address)
//        for (int i=0; i<3; i++){
//            System.out.println(marks[i]);
//        }


        // take a input from the user
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       // array declaration
       int [] numbers = new int[size];
       // input from user
        System.out.println("Enter your elements: ");
        for(int i=0; i<size; i++){
            numbers[i]= sc.nextInt();
        }
        System.out.println("Enter the elements you want to search: ");
        int num = sc.nextInt();
        //output
        for(int i=0; i<size; i++){
            if (num == numbers[i]){
                System.out.println("Index of an element: "+i);
            }
        }
    }
}

