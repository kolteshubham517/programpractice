package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class fnameComparator implements Comparator<StudentSort>{

    @Override
    public int compare(StudentSort o1, StudentSort o2) {
        return o1.fname.compareTo(o2.fname);
    }
}
class mnameComparator implements Comparator<StudentSort>{

    @Override
    public int compare(StudentSort o1, StudentSort o2) {
        return o1.mname.compareTo(o2.mname);
    }
}
class lnameComparator implements Comparator<StudentSort>{

    @Override
    public int compare(StudentSort o1, StudentSort o2) {
        return o1.lname.compareTo(o2.lname);
    }
}
class idComparator implements Comparator<StudentSort>{

    @Override
    public int compare(StudentSort o1, StudentSort o2) {
        return o1.id-o2.id;
    }
}
class marksComparator implements Comparator<StudentSort>{

    @Override
    public int compare(StudentSort o1, StudentSort o2) {
        return o1.marks- o2.marks;
    }
}
class Comparatorexample {
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
        Collections.sort(list);
        System.out.println(list);
        fnameComparator jj =new fnameComparator();
        Collections.sort(list,jj);
        System.out.println(list);
        mnameComparator jk=new mnameComparator();
        Collections.sort(list,jk);
        System.out.println(list);
        lnameComparator jl=new lnameComparator();
        Collections.sort(list,jl);
        System.out.println(list);
        idComparator jh=new idComparator();
        Collections.sort(list,jh);
        System.out.println(list);
        marksComparator jg =new marksComparator();
        Collections.sort(list,jg);
        System.out.println(list);
    }
}

