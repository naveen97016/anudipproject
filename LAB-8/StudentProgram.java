package projectanudip;
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(name + " is speaking.");
    }
}
class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}
public class StudentProgram {
    public static void main(String[] args) {
        Student student = new Student("Naveen", 24, 12);
        student.speak();
        student.study();
    }
}
