public class Function_OverLoading {
    public static void main(String[] args) {
        sum(8,5,7);
    }
    static void sum(int a, int b){
        System.out.println("Function with two arguments");
        System.out.println(a+b);
    }

    static void sum(int a, int b, int c){
        System.out.println("Function with three arguments");
        System.out.println(a+b+c);
    }
}
