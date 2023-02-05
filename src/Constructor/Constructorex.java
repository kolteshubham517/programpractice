package Constructor;
class A {
    public A() {
        System.out.println("constructor");
    }
}
class B extends A{
    public B() {
        System.out.println("const");
    }
}
public class Constructorex {
    public static void main(String[] args) {
        B obj = new B();
    }
}
