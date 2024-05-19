package projectanudip;
import java.util.Scanner;
public class CircleAreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.print("Do you want to calculate the area of a circle? (YES to continue): ");
            userInput = sc.nextLine().trim().toUpperCase();

            if (!userInput.equals("YES")) {
                break;
            }

            System.out.print("Enter the radius of the circle: ");
            double radius = sc.nextDouble();
            sc.nextLine(); // Consume the newline character

            double area = Math.PI * radius * radius;
            System.out.printf("The area of the circle is: %.2f\n", area);
        }

        sc.close();
        System.out.println("Program ended.");
	}

}
