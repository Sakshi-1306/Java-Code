// Access modifier example
package Bank;

class Bank_Acc{
    public String name;
    protected String dept;
    private int password;
    double num;

    // we can access the private properties by getter and setter
    public void getPass(){
        //setPass(123);
        // return password;
         System.out.println(password);
    }

    public void setPass(int pass){
        this.password = pass;
    }
}
public class Account {
    public static void main(String[] args) {

        Bank_Acc b = new Bank_Acc();
        b.name = "Sakshi";
        b.dept = "AIML";
        b.num = 5;
        // b.password =
        b.setPass(123);
        b.getPass();
        // System.out.println(b.getPass());
    }
}
