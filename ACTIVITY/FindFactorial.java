package projectanudip;
import java.util.*;
public class FindFactorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++)
        {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
	}
}