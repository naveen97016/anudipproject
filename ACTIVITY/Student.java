package projectanudip;
import java.util.Scanner;
public class Student {
    private String name;
    private int age;
    private String grade;
    private String studentID;
    public Student(Scanner sc) {
        System.out.print("Enter student name: ");
        this.name = sc.nextLine();
        System.out.print("Enter student age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student grade: ");
        this.grade = sc.nextLine();
        System.out.print("Enter student ID: ");
        this.studentID = sc.nextLine();
    }
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
        System.out.println("Student ID: " + studentID);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student(sc);
        student.displayStudentInfo();
    }
}
