public class AdvancePatterns {
    public static void main(String[] args) {
        //Butterfly pattern
        int n = 4;
        //upper half
        //first part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

        //spaces
        int spaces = 2 * (n - i);
        for (int s = 1; s <= spaces; s++) {
            System.out.print(" ");
        }
        //second part
        for (int k = 1; k <= i; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
        //lower half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for(int s=1; s<=spaces; s++){
                System.out.print(" ");
            }
            //second part
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }


        //solid rhombus or hollow solid rhombus
//        int n=5;
//        for(int i=1; i<=n; i++){
//            //spaces
//            for(int s=1; s<=n-i; s++){
//                System.out.print(" ");
//            }
//            //stars
//            for(int j=1; j<=n; j++) {
//                if (i == 1 || j == 1 || i == n || j == n) {
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // number pyramid
//        int n=5;
//        for(int i=1; i<=n; i++){
//            //spaces
//            for(int s=1; s<=n-i; s++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        for(int i=n; i>=1; i--){
//            //spaces
//            for(int s=1; s<=n-i; s++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // palindromic pyramid
//        int n=5;
//        //rows
//        for(int i=1; i<=n; i++){
//            //spaces
//            for(int s=1; s<=n-i; s++){
//                System.out.print(" ");
//            }
//            //first half
//            for(int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            //second half
//            for(int j=2; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        //diamond pattern
//        int n=5;
//        //rows
//        for(int i=1; i<=n; i++){
//            //spaces
//            for(int s=1; s<=n-i; s++) {
//                System.out.print(" ");
//            }
//            //first half stars
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=n; i>=1; i--){
//            //spaces
//            for(int s=1; s<=n-i; s++) {
//                System.out.print(" ");
//            }
//            //first half stars
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}

