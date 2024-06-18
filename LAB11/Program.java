package labs;

import java.util.Scanner;
interface Person {
    void speak();
}
class Student implements Person {
    public void speak() {
        System.out.println("Gooood Morming Teaaaacher....");
    }
}
class Teacher implements Person {
    public void speak() {
        System.out.println("Good morning class");
    }
}
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.speak();
        Teacher teacher = new Teacher();
        teacher.speak();
    }
}
