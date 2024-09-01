class DeepCopy{
    String name;
    double cgpa;

    DeepCopy(){

    }
    DeepCopy(DeepCopy d){
        name = d.name;
        cgpa = d.cgpa;
    }

    public void getInfo(){
        System.out.println(name);
        System.out.println(cgpa);
    }
}
public class DeepCopyExample{
    public static void main(String[] args) {
        DeepCopy D1 = new DeepCopy();
        D1.name = "Rahul verma";
        D1.cgpa = 9.2;
        D1.getInfo();
        DeepCopy D2 = new DeepCopy(D1);
        D2.name = "Neha Verma";
        D2.getInfo();
        D1.getInfo();
    }
}