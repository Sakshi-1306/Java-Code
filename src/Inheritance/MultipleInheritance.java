package Inheritance;

// Interface achieves pure abstraction.
interface Animal {
    void walk();
    int eyes = 2;
}

interface Herbivore{
    void eat();
}

class Horse implements Animal, Herbivore{
    @Override
    public void walk() {
        System.out.println(eyes);
        System.out.println("Walk on 4 legs");
    }

    @Override
    public void eat() {
        System.out.println("Eat plants");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}
