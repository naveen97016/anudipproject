package projectanudip;
import java.util.Scanner;
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        String userChoice;

        while (true) {
            System.out.println("\nBanking Application");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            userChoice = sc.nextLine();
            switch (userChoice) {
                case "1":
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Successfully deposited %.2f. Current balance: %.2f\n", depositAmount, balance);
                    } else {
                        System.out.println("Deposit amount must be positive.");
                    }
                    sc.nextLine(); // Consume the newline character
                    break;
                case "2":
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("Successfully withdrew %.2f. Current balance: %.2f\n", withdrawAmount, balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        System.out.println("Withdraw amount must be positive.");
                    }
                    sc.nextLine(); // Consume the newline character
                    break;
                case "3":
                    System.out.printf("Current balance: %.2f\n", balance);
                    break;
                case "4":
                    System.out.println("Thank you for using the Banking Application. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose an option between 1 and 4.");
            }
        }
	}

}
