package projectanudip;
import java.util.Scanner;
public class EvenOddChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("The number " + number + " is Even.");
        } 
        else 
        {
            System.out.println("The number " + number + " is Odd.");
        }
    }
}
