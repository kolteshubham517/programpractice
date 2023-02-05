package Abstraction_;


abstract class Animal {

    public void pig() {
        System.out.println("pig live in mud");
    }
}

class Tiger extends Animal {


    @Override
    public void pig() {
        super.pig();
        System.out.println(" Tiger eats pig");
    }
}


public class Abstract_Example2 {
    public static void main(String args[]) {

        Tiger T = new Tiger();
        T.pig();
    }
}