import java.util.*;
public class Transpose_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        //Initialization
        int[][] matrix = new int[row][col];
        // input
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("Given Matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // Transpose matrix
        System.out.println("Transpose matrix: ");
        for(int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
