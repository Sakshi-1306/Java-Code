class ShallowCopy{
    String name;
    double cgpa;

    ShallowCopy(){

    }
    ShallowCopy(ShallowCopy s){
        name=s.name;
        cgpa=s.cgpa;
    }

    public void getInfo(){
        System.out.println(name);
        System.out.println(cgpa);
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) {
        ShallowCopy s1 = new ShallowCopy();
        s1.name = "Rahul Verma";
        s1.cgpa = 8.9;
        s1.getInfo();
        ShallowCopy s2 = s1;
        s2.name = "Neha Verma";
        s2.getInfo();
        s1.getInfo();
    }
}
