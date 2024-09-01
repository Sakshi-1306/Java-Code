// This is compile time polymorphism . which is also called function overloading.
// functions having same name but their arguments are different.

class Student{
   int num;
   int age;
   String name;

   public int printInfo(int num){
       System.out.println("Function with int return type");
       this.num = num;
       return this.num;
   }

   public void printInfo(int age, String name){
       System.out.println("Function with void return type");
       System.out.println(age+" "+name);
   }

   public void printInfo(int age, int num){
       System.out.println(age+" "+num);
   }


}
public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.printInfo(4));
        s1.printInfo(22, "Sakshi");
        s1.printInfo(22, 5);
    }
}
