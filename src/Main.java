import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student st1 =  new Student("Fred","Flintstone",10001);
        Student st2 =  new Student("Barney","Rubble",10002);
        Student st3 =  new Student("Wilma","Flintstone",10003);
        Student st4 =  new Student("Betty","Rubble",10004);

        st1.addGrade("COMP 1011", 99);
        st1.addGrade("COMP 1008", 78);
        st1.addGrade("COMP 1030", 89);

        ArrayList<String> stringAL = new ArrayList<>();
        stringAL.add(st1.toString());
        stringAL.add(st2.toString());
        stringAL.add(st3.toString());
        stringAL.add(st4.toString());

        ArrayList<Student> studentAL = new ArrayList<>();
        studentAL.add(st1);
        studentAL.add(st1);
        studentAL.add(st2);
        studentAL.add(st3);
        studentAL.add(st4);

        System.out.printf("stringAL  -> %s%n",stringAL);
        System.out.printf("studentAL -> %s%n",studentAL);

        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.addAll(studentAL);

        TreeSet<Student> studentTreeSet = new TreeSet<>();
        studentTreeSet.addAll(studentAL);

        System.out.println("HashSet no duplicates: " + studentHashSet);
        System.out.println("TreeSet no duplicates (sorted)"+ studentTreeSet);
    }
}
