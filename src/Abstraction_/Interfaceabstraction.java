package Abstraction_;

interface A{
   void show();
}
abstract class B implements A{
    //@Override

}
class C extends B{

    @Override
    public void show() {

    }
}
public class Interfaceabstraction {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}
