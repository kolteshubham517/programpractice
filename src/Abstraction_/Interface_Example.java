package Abstraction_;

interface Trees {

    void wood();

}

class XYZ {

    void show() {

        System.out.println(" Trees are  cuts for wood ");
    }
}

class woodcutter extends XYZ implements Trees {

    @Override
    public void wood() {
        System.out.println(" Woodcutter cuts a trees");
    }
}

public class Interface_Example {

    public static void main(String args[]) {

        woodcutter W = new woodcutter();
        W.wood();
        W.show();
    }
}
