package comparable;

import java.util.ArrayList;
import java.util.List;
class StudentSort implements Comparable<StudentSort> {
    String fname;
    String mname;
    String lname;
    int marks;
    int id;

    public StudentSort(String fname, String mname, String lname, int id, int marks) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.id = id;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentSort o) {
        return this.fname.compareTo(fname);
    }

    @Override
    public String toString() {
        return "StudentSort{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", mname='" + mname + '\'' +
                ", marks=" + marks +
                ", id=" + id +
                '}';
    }
}
class Comparableexample1 {
    public static void main(String[] args) {
        StudentSort j=new StudentSort("Rushi","s","kamthe",101,98);
        StudentSort j1=new StudentSort("shubham","r","kolte",102,90);
        StudentSort j2=new StudentSort("sohel","l","inamdar",103,96);
        StudentSort j3=new StudentSort("karan","v","umap",104,88);
        StudentSort j4=new StudentSort("prashant","r","jagtap",105,60);
        StudentSort j5=new StudentSort("shubham","m","waidande",106,70);
        StudentSort j6=new StudentSort("prafull","p","karkar",107,65);
        StudentSort j7=new StudentSort("sagar","m","nigade",108,74);
        StudentSort j8=new StudentSort("vaibhav","v","gaikwad",109,99);
        StudentSort j9=new StudentSort("ganesh","s","anarse",110,87);
        List<StudentSort> list= new ArrayList<>();
        list.add(j);
        list.add(j1);
        list.add(j2);
        list.add(j3);
        list.add(j4);
        list.add(j5);
        list.add(j6);
        list.add(j7);
        list.add(j8);
        list.add(j9);
        System.out.println(list);
    }
}

