package Bank;

public class Bank_package_Example {
   // You can make it public but if you make it protected then you have to extend Bank in a subClass.
   public String name="Sakshi";
   public static int acc=1010;

   public void print(){
      System.out.println("This is method in bank package example class");
   }
   public static int add(int a, int b){
      return a+b;
   }
}
