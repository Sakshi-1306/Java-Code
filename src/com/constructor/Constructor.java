package com.constructor;

class DefaultConstructor{

    DefaultConstructor(){
        System.out.println("Default constructor called.");
        System.out.println("-----------------------------");
    }
}

class ParameterizedConstructor{
    String Name;
    int Age;

    ParameterizedConstructor(String name, int age){
        System.out.println("Parameterized com.constructor.Constructor Called");
        Name = name;
        Age = age;
    }

    public void printInfo(){
        System.out.println(Name);
        System.out.println(Age);
        System.out.println("----------------------------------");
    }
}

class CopyConstructor{
    String name;
    int age;
    int salary;

    CopyConstructor(){

    }

    CopyConstructor(CopyConstructor c2 ,int num){
        System.out.println("Copy com.constructor.Constructor called");
        name = c2.name;
        age = c2.age;
        salary = num;
    }

    public void printInfo(int phno){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(phno);
    }

}
public class Constructor {
    public static void main(String[] args) {
        DefaultConstructor c1 = new DefaultConstructor();

        ParameterizedConstructor p1 = new ParameterizedConstructor("Sakshi",22);
        p1.printInfo();

        CopyConstructor cp1 = new CopyConstructor();
        cp1.name = "Sakshi";
        cp1.age = 22;
        cp1.salary=2000;
        CopyConstructor cp2 = new CopyConstructor(cp1,200);
        cp1.printInfo(152);
        cp2.printInfo(156);
    }
}
