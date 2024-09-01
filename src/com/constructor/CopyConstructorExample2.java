package com.constructor;

class teacher{
    String name;
    double salary;
    String dept;
    teacher(){

    }

    teacher(teacher t){
        name = t.name;
        salary =t.salary;
        dept = t.dept;
    }
    void getInfo(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(dept);
    }
}
public class CopyConstructorExample2 {

    // without using new keyword which create the shallow copy.

    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.name = "Rahul verma";
        t1.salary = 25000;
        t1.getInfo();

        teacher t2 = t1;
        t2.dept = "AIML";
        t2.getInfo();

    }
}
