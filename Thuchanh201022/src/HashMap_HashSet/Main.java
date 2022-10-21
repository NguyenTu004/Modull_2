package HashMap_HashSet;
import java.util.*;
import java.util.SortedSet;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");
        Map<Integer, Student> map = new HashMap<Integer, Student>();
        map.put(1, student1);
        map.put(2, student2);
        map.put(3, student3);
        map.put(4, student1);
        for(Map.Entry<Integer, Student> student : map.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> set = new HashSet<Student>();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        for(Student student : set){
            System.out.println(student.toString());
        }
    }
}
