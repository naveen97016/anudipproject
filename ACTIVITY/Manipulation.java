package projectanudip;
import java.util.*;
public class Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Reversed String: " + new StringBuilder(input).reverse());
    }
}
	