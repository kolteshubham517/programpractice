package abstraction;

abstract class publictransport{
    abstract void transport();
}
    class passenger extends publictransport{
    void transport(){System.out.println("bus");}
    }
    class pmpml extends publictransport{
    void transport(){System.out.println("olectra");}
    }
public class Abstractionexample1 {
    public static void main(String[] args) {
        publictransport pt = new passenger();
        pt.transport();

    }
}
