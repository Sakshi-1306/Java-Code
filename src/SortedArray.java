public class SortedArray {
    public static boolean IsSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] >= arr[index+1]){
            return false;
        }
        else{
            return IsSorted(arr,index+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        System.out.println(IsSorted(arr,0));
    }

}
