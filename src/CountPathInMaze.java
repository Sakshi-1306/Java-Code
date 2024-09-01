public class CountPathInMaze {
    public static int countPath(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        // move downwards
        int downwards = countPath(i+1,j,n,m);

        // move Right
        int rightwards = countPath(i,j+1,n,m);

        return downwards+rightwards;
    }
        // here , we use backtracking.
    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPath = countPath(0,0,n,m);
        System.out.println(totalPath);
    }
}
