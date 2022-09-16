import java.util.Scanner;
import java.lang.Math;


public class Main {
	public static void menu() {
		System.out.println("Choose Shape: ");
		System.out.println("1) Rectangle and Sqaures");
		System.out.println("2) Circle");
		System.out.println("3) Trapezoid");
		System.out.println("4) Triangle");
		System.out.println("5) Quit");
	}
	public static String rectangle() {
		System.out.println("You have selected the rectangle and Square Option");
		int length = Utils.obtainIntegerInput("Enter Length: ");
		int width = Utils.obtainIntegerInput("Enter Width: ");
		return ("The Calculated Area is " + length*width);
	}
	public static String triangle() {
		int base = Utils.obtainIntegerInput("Enter base value: ");
		int height = Utils.obtainIntegerInput("Enter height value: ");		
		return ("The calculated area is "+ ((base*height)/2));
	}
	public static String circle() {
		int radius = Utils.obtainIntegerInput("Enter radius: ");
		double rawNumber = Math.PI *(radius*radius);
		double roundedNumber = Math.round(rawNumber * 100.0) / 100.0;
		return ("The rounded area is "+ roundedNumber);
	}
	public static String trapezoid() {
		int baseA = Utils.obtainIntegerInput("Enter base A value: ");
		int baseB = Utils.obtainIntegerInput("Enter base B value: ");
		int height = Utils.obtainIntegerInput("Enter height value: ");
		double area =  ((baseA+baseB)/2 * height);
		return ("The calculated area is "+ area);
	}
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int choice;
		System.out.println("Welcome to the Area Calculater");

		while (true) {
		menu();
		
		choice  = Utils.obtainIntegerInput("What is your choice: ");
		
		if (choice == 1) {
			System.out.println(rectangle());
		}
		else if (choice == 2) {
			System.out.println(circle());
		}
		else if (choice == 3) {
			System.out.println(trapezoid());
		}
		else if (choice == 4) {
			System.out.println(triangle());}
		else if (choice==5) 
			break;
		else
			System.out.println("Invalid Input selected. Please try again!");
		}
		System.out.println("Thank you for using the area calculater");

}
}