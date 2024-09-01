import java.util.*;

class Encapsulation{
    private double password;

    private void setPassword(double pass){
        password = pass;
    }
    public double getPassword(){
        setPassword(Math.random());
        return password;
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        Encapsulation E = new Encapsulation();
        // E.setPassword(234);
        System.out.println(E.getPassword());
    }
}
