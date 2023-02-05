package comparable;

import java.util.ArrayList;
import java.util.Collections;

class student implements Comparable<student>{
    int studid;
    String firstname;
    String lastname;
    float percent;
    int year;

    student(int studid, String firstname, String lastname, float percent, int year){
        this.studid = studid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.percent = percent;
        this.year = year;
    }

    public int compareTo(student st){
        if(studid==st.studid)
            return 0;
        else if(studid>st.studid)
            return 1;
        else
            return -1;
    }
}

public class Comparableexample {
    public static void main(String[] args) {
        ArrayList<student> al = new ArrayList<student>();
        al.add(new student(1, "shubham", "kolte", 60.00f, 2022));
        al.add(new student(2, "soham", "kulkarni", 60.09f, 2022));
        al.add(new student(3, "sameer", "pote", 60.08f, 2022));
        al.add(new student(4, "aditya", "kulkarni", 60.07f, 2022));
        al.add(new student(5, "shubham", "mahamuni", 60.06f, 2022));
        al.add(new student(6, "aditya", "deshmukh", 60.06f, 2022));
        al.add(new student(8, "aditya", "gaikwad", 60.06f, 2022));
        al.add(new student(10, "ashish", "mane", 60.06f, 2022));


        Collections.sort(al);
        for (student st : al) {
            System.out.println(st.studid + " " + st.firstname + " " + st.lastname + " " + st.percent + " " + st.year + " ");
        }
    }
}



