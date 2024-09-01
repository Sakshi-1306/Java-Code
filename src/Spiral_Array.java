import java.util.*;
public class Spiral_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of the rows: ");
        int n = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int m = sc.nextInt();

        // declaration of an array
        int[][] matrix = new int[n][m];

        //taking an input from the user
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //printing spiral matrix
        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = m-1;

        while(row_start<=row_end && col_start<=col_end){

            //first loop
            for(int col=col_start; col<=col_end; col++){
                System.out.print(matrix[row_start][col]+" ");
            }
            row_start++;

            //second loop
            for(int row=row_start; row<=row_end; row++){
                System.out.print(matrix[row][col_end]+" ");
            }
            col_end--;

            //third loop
            for(int col=col_end; col>=col_start; col--){
                System.out.print(matrix[row_end][col]+" ");
            }
            row_end--;

            //fourth loop
            for(int row=row_end; row>=row_start; row--){
                System.out.print(matrix[row][col_start]+" ");
            }
            col_start++;
        }

    }
}
