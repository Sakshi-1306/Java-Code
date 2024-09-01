import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        //solid rectangle pattern
//        *****
//        *****
//        *****
//        *****
        //code we can also take the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
//        System.out.println("Enter the number of columns: ");
//        int m= sc.nextInt();

        //outer loop for rows
//        for (int i=1; i<=n; i++){
//            //inner loop for columns
//            for (int j=1; j<=m; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //hollow rectangle
        //****
        //*  *
        //*  *
        //****

        //outer loop for rows
//        for (int i=1; i<=n; i++){
//            //inner loop for columns
//            for (int j=1; j<=m; j++){
//                //boundary value
//                if (i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //half pyramid
//        *
//        **
//        ***
//        ****

        // in this problem number of the rows is equal to the number os stars to be print
        //outer loop
//        for( int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //inverted half pyramid
//        ****
//        ***
//        **
//        *
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //inverted half pyramid
//           *
//          **
//         ***
//        ****
        //outer loop for rows
//        for (int i=1;i<=n;i++){
//            //inner loop for spaces
//            for(int k=1;k<=n-i;k++){
//                System.out.print(" ");
//            }
//            //inner loop for columns
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
        // inverted half pyramid
//        ****
//         ***
//          **
//           *
        //outer loop for rows
        for(int i=n;i>=1;i--){
            //inner loop for spaces
            for (int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            //inner loop for stars printing
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
