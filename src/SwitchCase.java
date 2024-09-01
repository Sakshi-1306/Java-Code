import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of the fruit");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("A round fruit");
//            default -> System.out.println("Invalid fruit");
//        }

        switch (fruit) {
            case "Mango":
                System.out.println("King of the fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("A round fruit");
                break;
            default:
                System.out.println("Invalid fruit");
                break;
        }
    }
}
