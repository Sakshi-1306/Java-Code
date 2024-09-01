abstract class Animal{
    Animal(){
        System.out.println("Constructor in Animal class");
    }
    abstract void walk();
    public static void eats(){
        System.out.println("Animals eats everything");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Constructor in Horse class");
    }
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Animal.eats();
        // horse.walk();
        //horse.eats();
//        Chicken chicken = new Chicken();
//        chicken.walk();
       // Animal A = new Animal(); A.walk();

    }
}
