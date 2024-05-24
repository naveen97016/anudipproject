package projectanudip;
import java.util.Scanner;
public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = sc.nextInt();
	        System.out.print("Enter the third number: ");
	        int num3 = sc.nextInt();
	        int largest = (num1 > num2) 
	                      ? (num1 > num3 ? num1 : num3) 
	                      : (num2 > num3 ? num2 : num3);
	        System.out.println("The largest number is: " + largest);
	    }
	}