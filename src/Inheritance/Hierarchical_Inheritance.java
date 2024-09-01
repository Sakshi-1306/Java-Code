package Inheritance;

class book{
    String BName;
    String AName;
    int price;

}

class publisher extends book{
    int P_Id;
    String P_Name;

    public void getInfo(String BN, String AN, int p, String PN, int id){
        BName = BN;
        AName = AN;
        price = p;
        P_Id = id;
        P_Name = PN;
    }
    public void printInfo(){
        System.out.println("-----------------------------");
        System.out.println("Book Name: "+BName);
        System.out.println("Author Name: "+AName);
        System.out.println("Book price: "+price);
        System.out.println("Publisher Name: "+P_Name);
        System.out.println("Publisher ID: "+P_Id);
        System.out.println("-----------------------------");
    }
}

class Readers extends book{

    public void getInfo(String BN, String AN, int p){
        BName = BN;
        AName = AN;
        price = p;
    }

    public void printInfo(){
        System.out.println("Book Name: "+BName);
        System.out.println("Author Name: "+AName);
        System.out.println("Book price: "+price);
        System.out.println("-----------------------------");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        publisher p = new publisher();
        p.getInfo("November 9","collean hover",200,"paperback",101);
        p.printInfo();

        Readers r = new Readers();
        r.getInfo("Atomic Habits","James Clear",180);
        r.printInfo();

    }
}
