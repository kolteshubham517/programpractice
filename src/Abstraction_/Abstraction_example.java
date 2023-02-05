package Abstraction_;

abstract class Abstraction_example {
    public abstract void XYZ();

    public void sleep() {
        System.out.println(" ZZZ");
    }

}

class Abstration_example1 extends Abstraction_example {

    @Override
    public void XYZ() {

    }
}

class main {
    public void main(String args[]) {

        Abstration_example1 AB = new Abstration_example1();
        AB.sleep();
        AB.XYZ();
    }
}

