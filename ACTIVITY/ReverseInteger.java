package projectanudip;
import java.util.*;
public class ReverseInteger {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter an integer: ");
int num = sc.nextInt();
int reversed = Integer.parseInt(new StringBuilder(Integer.toString(num)).reverse().toString());
System.out.println("Reversed integer: " + reversed);
}
}