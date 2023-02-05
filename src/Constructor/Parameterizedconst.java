package Constructor;

class Parameterizedconst{
    int id;
    String name;
    Parameterizedconst(int i,String n){
        id = i;
        name = n;
    }
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        //creating objects and passing values
        Parameterizedconst s1 = new Parameterizedconst(27,"shubham");
        //calling method to display the values of object
        s1.display();
    }
}
