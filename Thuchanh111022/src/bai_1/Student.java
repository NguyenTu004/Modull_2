package bai_1;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change(String text){
        college = text;
    }
    protected void display (){
        System.out.println(rollno+" "+name+" "+college);
    }
}


