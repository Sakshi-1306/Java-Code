public class NumberPatterns {
    public static void main(String[] args) {
//        1
//        12
//        123
//        1234
//        int n=4;
//        for(int i=1;i<=n; i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        //inverted half pyramid numbers
//        int n=5;
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //increment number Floyd's triangle
//        int n=6;
//        int number=1;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }
        //triangle 0 1
        int n=5;
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                int sum= i+j;
                if (sum % 2 == 0){//even
                    System.out.print("1 ");
                }else{//odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
