package overloading;


public class Overloadingexample {

        void show(){

        }
        void show(int a, int b){

    }
    void show(String a, String b){

    }
    void show(char a, char b){

    }
    void show(float a, float b){

    }

    public static void main(String[] args) {
        Overloadingexample ovr = new Overloadingexample();
        ovr.show();
    }
}
