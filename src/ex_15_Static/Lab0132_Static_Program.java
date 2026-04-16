package ex_15_Static;

public class Lab0132_Static_Program {
    public static void main(String[] args) {
        Student s1 = new Student("Riya");
        Student s2 = new Student("Iron");
        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.course_name);
        System.out.println(s2.course_name);

        Student.m1();
    }
}
class Student{
    String name;                                 // Instance Variable
    static String course_name = "ATB15x";        // Static Variable

    public Student (String name){
        this.name = name;
    }

    static void m1(){                              // Static Method
        System.out.println("I am static Method ");
    }
}
