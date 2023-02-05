package Constructor;

public class Constructorchain {

    private int id;
    private String name;

    public Constructorchain() {
        this("shubham", 25);
        System.out.println("Default Employee Created");
    }

    public Constructorchain(int i) {
        this("shubham", i);
        System.out.println("Employee Created with Default Name");
    }
    public Constructorchain(String s, int i) {
        this.id = i;
        this.name = s;
        System.out.println("Employee Created");
    }
    public static void main(String[] args) {

        Constructorchain emp = new Constructorchain();
        System.out.println(emp);
        Constructorchain emp1 = new Constructorchain(10);
        System.out.println(emp1);
        Constructorchain emp2 = new Constructorchain("shubham", 24);
        System.out.println(emp2);
    }

    @Override
    public String toString() {
        return "ID = "+id+", Name = "+name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
