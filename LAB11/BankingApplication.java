package labs;
import java.util.Scanner;

interface BankingInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
class SavingsAccount implements BankingInterface {
    private double balance;
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }
    public double getBalance() {
        return balance;
    }
}
class CurrentAccount implements BankingInterface {
    private double balance;
    private double overdraftLimit = 500; // Example overdraft limit
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingInterface account;

        System.out.println("Select account type (1: Savings, 2: Current): ");
        int accountType = sc.nextInt();
        switch (accountType) {
            case 1:
                account = new SavingsAccount();
                break;
            case 2:
                account = new CurrentAccount();
                break;
            default:
                System.out.println("Invalid account type");
                return;
        }
        boolean exit = false;
        while (!exit) {
            System.out.println("Select operation (1: Deposit, 2: Withdraw, 3: Get Balance, 4: Exit): ");
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }
}