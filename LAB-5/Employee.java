package projectanudip;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setEmployeeDetails(21, "Naveen", "Anudip Foundations");
        displayEmployeeDetails();
    }
    static int eid;
    static String ename;
    static String companyName;

    public static void setEmployeeDetails(int id, String name, String company) {
        eid = id;
        ename = name;
        companyName = company;
    }
    public static void displayEmployeeDetails() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Company Name: " + companyName);
    }
}