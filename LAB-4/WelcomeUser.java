package projectanudip;
import java.util.Scanner;
public class WelcomeUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your name: ");
	        String name = sc.nextLine();
	        System.out.println("Welcome, " + name + "!");
	        sc.close();
	}

}
