import java.util.*;
public class Two_Dimensional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        // input rows
        System.out.println("Enter the elements: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to find: ");
        int x = sc.nextInt();

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j]==x){
                    System.out.println("Element found at location ("+i+","+j+")");
                }
            }

        }
    }
}
