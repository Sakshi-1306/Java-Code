package com.constructor;

class Student1{
    String name;
    int age;
    String dept;
    int mark;

    Student1(){

        System.out.println("Default constructor called for student1 object");
    }

    Student1(Student1 s , String dept , int marks){
        name = s.name;
        age = s.age;
        this.dept = dept;
        mark = marks;
    }

    public void getInfo(int RollNo){
        System.out.println(name);
        System.out.println(age);
        System.out.println(dept);
        System.out.println(RollNo);
        System.out.println(mark);
    }

}

public class ConstructorCopy {
    public static void main(String[] args) {
       Student1 s1 = new Student1();
       s1.name = "Sakshi";
       s1.age = 22;
       s1.dept = "AIML";

       Student1 s2 = new Student1(s1,"AI",98);
       s2.getInfo(54);
       s1.getInfo(45);
    }
}
