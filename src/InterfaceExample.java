interface Operation {
    int add(int a, int b);
    int division(int a, int b);
}

class Addition implements Operation{
    Addition(){
        System.out.println("Addition constructor called");
    }
    public int add(int a, int b){
        return a+b;
    }

    @Override
    public int division(int a, int b) {
        return 0;
    }
}
class Division extends Addition implements Operation{
    Division(){
        System.out.println("Division Constructor called");
    }
    public int division(int a, int b){
        return a/b;
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Division D = new Division();
        System.out.println( D.add(5,4));
        System.out.println(D.division(4,4));
    }
}
