package Abstraction_;

interface M {
    void Show();
}

abstract class N {
    void Y() {
        System.out.println("class->abstract class->interface");
    }
}

class Xy extends N implements M {
    @Override
    public void Show() {
        System.out.println("class->abstract class->interface");
    }
}

public class AbstractionInterface {
    public static void main(String[] args) {
        Xy x = new Xy();
        x.Show();
        x.Y();
    }
}
