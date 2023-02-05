package comparable;
import java.util.*;
import java.io.*;

class sstudent{
    int studid;
    String firstname;
    String lastname;

    int mark;

    long year;
    sstudent(int studid,String firstname,String lastname,int mark,int year){
        this.studid=studid;
        this.firstname=firstname;
        this.lastname=lastname;
        this.mark=mark;
        this.year=year;
    }
}

class NameComparator implements Comparator<sstudent>{
    public int compare(sstudent s1,sstudent s2){
        return s1.firstname.compareTo(s2.firstname);
    }
}

/*class yearComparator implements Comparator<sstudent>{
    public int compare(sstudent s1,sstudent s2){
        return s1.year.compareTo(s2.year);
    }
}*/


public class Comparatorexample1 {
    public static void main(String[] args) {
    ArrayList<sstudent> al = new ArrayList<sstudent>();
        al.add(new sstudent(1, "shubham", "kolte", 60, 2022));
        al.add(new sstudent(2, "soham", "kulkarni", 65, 2020));
        al.add(new sstudent(3, "sameer", "pote", 70, 2022));
        al.add(new sstudent(4, "aditya", "kulkarni", 75, 2022));
        al.add(new sstudent(5, "shubham", "mahamuni", 80, 2022));
        al.add(new sstudent(6, "aditya", "deshmukh", 85, 2022));
        al.add(new sstudent(8, "aditya", "gaikwad", 90, 2022));
        al.add(new sstudent(10, "ashish", "mane", 95, 2022));

        Collections.sort(al,new NameComparator());
        for(sstudent st: al){
            System.out.println(st.studid+" "+st.firstname+" "+st.lastname+" "+st.mark+" "+st.year+" ");
        }
       /* Collections.sort(al,new yearComparator());
        for(sstudent st: al){
            System.out.println(st.studid+" "+st.firstname+" "+st.lastname+" "+st.mark+" "+st.year+" ");
        }*/
    }
}
