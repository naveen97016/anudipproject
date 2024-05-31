package projectanudip;
import java.util.*;
public class ASCIIValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII value of " + ch + " is: " + (int) ch);
    }
}