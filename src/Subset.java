import java.util.ArrayList;

public class Subset {
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void getSubset(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSubset(subset);
            return;
        }
        // if add
        subset.add(n);
        getSubset(n-1,subset);

        // if not
        subset.remove(subset.size()-1);
        getSubset(n-1,subset);
    }
    // Time Complexity = O(2^n)
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        getSubset(n,subset);
    }
}
