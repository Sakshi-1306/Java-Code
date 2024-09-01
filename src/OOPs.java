class Student{
    // Properties of a class (Data Members)
    String name;
    int age;
    String Class;

    // methods (member functions)
    public void getInfo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.Class);
    }

}

public class OOPs {
    public static void main(String[] args) {
        // object instantiated
        Student s1 = new Student();
        // function calling using . operator.
        s1.Class = "A";
        s1.getInfo("Sakshi", 22);
        s1.printInfo();

        Student s2 = new Student();
        s2.Class = "B";
        s2.getInfo("Riya", 22);
        s2.printInfo();

        Student s3 = new Student();
        s3.Class = "C";
        s3.getInfo("Aniket",21);
        s3.printInfo();
    }

}
