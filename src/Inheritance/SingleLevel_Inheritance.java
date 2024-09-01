package Inheritance;

class shape{
    String color;
    int length;
    int height;
    static int a=5;
    public void getInfo(){
        System.out.println("Base class Function");
    }

    public void getInfo(int l, int h, String c){
        length = l;
        height = h;
        color = c;
    }
}

class Rectangle extends shape{

    public void area(){
        System.out.println("Area of the Rectangle: "+length * height);
    }

    public void getInfo(){
        System.out.println("Derived class function");
        System.out.println(color);
        System.out.println(a);
    }
}

public class SingleLevel_Inheritance {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getInfo();
        r.getInfo(5,4,"Black");
        r.area();
        r.getInfo();
    }
}
