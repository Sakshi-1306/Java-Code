public class TowerOfHanoi {
   public static void printTowerOfHanoi(int n, String src, String helper, String dest){
       if(n == 1){
           System.out.println("Transfer disk "+ n +" from "+ src +" to "+dest+".");
           return;
       }
       printTowerOfHanoi(n-1,src,dest,helper);
       System.out.println("Transfer disk "+ n +" from "+ src +" to "+dest+".");
       printTowerOfHanoi(n-1,helper,src,dest);
   }
    // Time Complexity - O(2^n)
    public static void main(String[] args) {
        int n = 3;
        printTowerOfHanoi(n,"Source","Helper","Destination");
    }
}
