package Abstraction_;

abstract class Pets {

    abstract void cat();
}

abstract class dog extends Pets {

    abstract void Buffalo();

}

class Bull extends dog {


    @Override
    void cat() {
        System.out.println("Cat is in house to eat food");
    }

    @Override
    void Buffalo() {
        System.out.println("Buffalo is in Maountain to eat food");
    }
}

public class Abstraction_Example4 {
    public static void main(String args[]) {

        Bull B = new Bull();
        B.cat();
        B.Buffalo();


    }
}
