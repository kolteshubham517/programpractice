package inheritance;

class A {
    void walk(){System.out.println("walk");}
}

class B extends A {
    void run(){System.out.println("run");}
}
public class Singleinheritance {
    public static void main(String[] args) {
        B Bb = new B();
        Bb.walk();
        Bb.run();
    }
}
