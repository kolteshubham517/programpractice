package inheritance;

class P{
    void stop(){System.out.println("stop");}
}
class Q extends P{
    void walk(){System.out.println("walk");}
}
class R extends P{
    void run(){System.out.println("run");}
}
public class Hierarchical {
    public static void main(String[] args) {
        R Rr = new R();
        Rr.run();
        Rr.stop();

    }
}
