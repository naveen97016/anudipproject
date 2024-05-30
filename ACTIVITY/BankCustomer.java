package projectanudip;
import java.util.*;
public class BankCustomer {
	  private String accNo;
	    private String accType;
	    private double amount;
	    public BankCustomer() {
	        this.accNo = "ANU00DIP001";
	        this.accType = "Savings";
	        this.amount = 100000;
	    }
	    public BankCustomer(String accNo, String accType) {
	        this.accNo = accNo;
	        this.accType = accType;
	        this.amount = 8000;
	    }
	    public BankCustomer(String accNo, String accType, double amount) {
	        this.accNo = accNo;
	        this.accType = accType;
	        this.amount = amount;
	    }
	    public void display() {
	        System.out.println("Account Number: " + accNo);
	        System.out.println("Account Type: " + accType);
	        System.out.println("Amount: " + amount);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        BankCustomer c1 = new BankCustomer();
	        c1.display();
	        System.out.println("-----");
	        System.out.print("Enter Account Number: ");
	        String accNo2 = sc.nextLine();
	        System.out.print("Enter Account Type: ");
	        String accType2 = sc.nextLine();
	        BankCustomer c2 = new BankCustomer(accNo2, accType2);
	        c2.display();
	        System.out.println("-----");
	        System.out.print("Enter Account Number: ");
	        String accNo3 = sc.nextLine();
	        System.out.print("Enter Account Type: ");
	        String accType3 = sc.nextLine();
	        System.out.print("Enter Amount: ");
	        double amount3 = sc.nextDouble();
	        BankCustomer c3 = new BankCustomer(accNo3, accType3, amount3);
	        c3.display();
	    }
	}
