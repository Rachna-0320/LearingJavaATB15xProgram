package ex_15_Static;

import java.sql.SQLOutput;

public interface Lab0131_Static_Practice {
    public static void main(String[] args) {

        ATB. markAttendance();     // Static method does not need object to access

        ATB A = new ATB();
        System.out.println(A.course_name);
        A.display();

    }
}

class ATB{
    int phone_num;
    String name;

    static String course_name = "ATB";

    static void markAttendance(){
        System.out.println("Mark Attendance");
//        System.out.println(this.phone_num);    // Static method can not use non-static variable
//        because static is common for all object.
    }

    void display() {
        System.out.println(this.phone_num + this.name + course_name);
    }

    static class A {

    }
}