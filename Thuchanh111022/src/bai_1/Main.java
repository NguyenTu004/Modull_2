package bai_1;

public class Main {
    public static void main(String[] args) {
       Student.change();
       Student s1 = new Student(111,"Duc Anh_1");
       Student s2 = new Student(222,"Duc Anh_2");
       Student s3 = new Student(333,"Duc Anh_3");
       s1.display();
       s2.display();
       s3.display();
    }
}