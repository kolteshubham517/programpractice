package inheritance;

class X{
    void walk(){System.out.println("walk");}
}
class Y extends X{
    void or(){System.out.println("or");}
}

class Z extends Y{
    void run(){System.out.println("run");}
}

public class Multilevelinheritance {
    public static void main(String[] args) {
        Z Cc = new Z();
        Cc.walk();
        Cc.or();
        Cc.run();
    }
}
