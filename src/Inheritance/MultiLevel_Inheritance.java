package Inheritance;

class Books{
    String Book_Name;
    int price;

    public void getInfo(){
        System.out.println("Base Class function");
    }
}

class Author extends Books{
    String Author_Name;

    public void getBookInfo(String name, int p, String A_name){
        Book_Name = name;
        price = p;
        Author_Name = A_name;
    }

    public void getInfo(){
            System.out.println("Derived class [Inheritance.Author] function");
    }
}

class Reader extends Author{
    public void printBookInfo(){
        System.out.println("Book Name: "+Book_Name);
        System.out.println("Inheritance.Author Name: "+Author_Name);
        System.out.println("Book price: "+price);
    }

    public void getInfo(){
        System.out.println("Derived class [Inheritance.Reader] function");
    }
}
public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Reader r1 = new Reader();
        r1.getInfo();
        r1.getBookInfo("November 9",200,"Collean Hover");
        r1.printBookInfo();

        // here we install package called inheritance in which stored our singleInheritance class
        // that's why we can access Rectangle class method by creating its object and calling its function
        Rectangle r = new Rectangle();
        r.getInfo(5,4,"Blue");
        r.area();
    }
}
