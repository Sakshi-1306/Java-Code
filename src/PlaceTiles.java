public class PlaceTiles {
    public static int placeTiles(int n , int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        //place horizontally
        int horizatally = placeTiles(n - 1, m);

        //place vertically
        int vertically = placeTiles(n - m, m);

        return horizatally + vertically;
    }
    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }
}
