package abstraction;

abstract class Abstractionexample{
    abstract void run();
}

class Honda4 extends Abstractionexample{
    void run(){System.out.println("shubham completed his mca in 2022");}

    public static void main(String args[]){
        Abstractionexample obj = new Honda4();
        obj.run();
    }
}
