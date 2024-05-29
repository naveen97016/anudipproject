package projectanudip;
import java.util.Scanner;
public class InbuiltFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = sc.nextLine();
		        int length = input.length();
		        String uppercase = input.toUpperCase();
		        String lowercase = input.toLowerCase();
		        String trimmed = input.trim();
		        StringBuilder reversedBuilder = new StringBuilder(input).reverse();
		        String reversed = reversedBuilder.toString();
		        System.out.println("Original String: " + input);
		        System.out.println("Length: " + length);
		        System.out.println("Uppercase: " + uppercase);
		        System.out.println("Lowercase: " + lowercase);
		        System.out.println("Trimmed: " + trimmed);
		        System.out.println("Reversed: " + reversed);
		    }
		}