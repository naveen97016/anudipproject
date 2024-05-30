package projectanudip;
import java.util.*;
public class CricleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}

