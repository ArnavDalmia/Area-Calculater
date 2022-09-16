import java.util.Scanner;

public class Utils {

	public static boolean isInteger(String inputString) {
		
		try {
			Integer.parseInt(inputString);
			return true;
	}
	catch (NumberFormatException e) {
		return false;
	}
	}
	public static int obtainIntegerInput(String prompMessage) {
		String temp = "";
		Scanner userInput = new Scanner(System.in);
		
		boolean validInput = false;
		
		while (!validInput)
		{	
			System.out.println(prompMessage);
			temp = userInput.nextLine();
			
			if (isInteger(temp))
				validInput = true;
			else
				System.out.println("You must enter an integer. Try again!");
			
			}
		return Integer.parseInt(temp);
	
	
	
}
	
	
	
	
	
	
	public static boolean isDouble(String inputString) {
	
	try {
		Double.parseDouble(inputString);
		return true;
}
catch (NumberFormatException e) {
	return false;
}
	}

public static double obtainDoubleInput(String prompMessage) {
	String temp = "";
	Scanner userInput = new Scanner(System.in);
	
	boolean validInput = false;
	
	while (!validInput)
	{	
		System.out.println(prompMessage);
		temp = userInput.nextLine();
		
		if (isDouble(temp))
			validInput = true;
		else
			System.out.println("You must enter a decimal. Try again!");
		
		}
	return (double) Double.parseDouble(temp);
}
}