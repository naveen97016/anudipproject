package projectanudip;
class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public void work() {
        System.out.println(name + " is working in the " + department + " department.");
    }
}
class Manager extends Employee {
    int teamSize;
    public Manager(String name, String department, int teamSize) {
        super(name, department);
        this.teamSize = teamSize;
    }
    public void manageTeam() {
        System.out.println(name + " is managing a team of " + teamSize + " employees.");
    }
}
class Worker extends Employee {
    public Worker(String name, String department) {
        super(name, department);
    }

    public void doTask() {
        System.out.println(name + " is performing a task in the " + department + " department.");
    }
}
class Intern extends Worker {
    public Intern(String name, String department) {
        super(name, department);
    }
    public void learn() {
        System.out.println(name + " is learning new skills as an intern in the " + department + " department.");
    }
}
public class CompanyHierarchy {
    public static void main(String[] args) {
        Manager manager = new Manager("Bhagi", "Management", 5);
        manager.work();
        manager.manageTeam();
        Worker worker = new Worker("Naveen", "Engineering");
        worker.work();
        worker.doTask();
        Intern intern = new Intern("Bhagi", "Marketing");
        intern.work();
        intern.doTask();
        intern.learn();
    }
}
