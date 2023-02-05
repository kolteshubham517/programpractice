package Abstraction_;

interface Xyz {
    void A();
}

abstract class ABC {
    void B() {
        System.out.println("Abstract class");
    }
}

class AB extends ABC implements Xyz {
    @Override
    public void A() {
        System.out.println(" Example of Interface And Abstraction_");
    }
}
public class Interface_example1 {

    public static void main(String args[]) {

        AB Q = new AB();
        Q.A();
        Q.B();
    }
}
