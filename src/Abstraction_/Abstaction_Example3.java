package Abstraction_;


abstract class Animals {

    abstract void cat();

    void maouse() {

        System.out.println("cat hunt the maouse");
    }
}

class Dog extends Animals {

    @Override
    void cat() {
        System.out.println("Cat is pet ");
    }

    @Override
    void maouse() {
        super.maouse();
    }
}

public class Abstaction_Example3 {

    public static void main(String args[]) {

        Dog D = new Dog();
        D.cat();
        D.maouse();
    }
}
