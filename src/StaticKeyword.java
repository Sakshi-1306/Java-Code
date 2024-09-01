class Static{
    static double pi = 3.14;

    public static double Area(double r){
        return pi*r*r;
    }
}

public class StaticKeyword {
    static int a = 5;
    static int b;

    static {
        System.out.println("Static block initialized");
        b = a*4;
    }
    static void block(){
        System.out.println("Static block");
    }

    public static void main(String[] args) {

        System.out.println(Static.Area(5));
        block();
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }

}
