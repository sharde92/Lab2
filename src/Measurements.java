import java.util.Scanner;

public class Measurements {
	

	public static void main(String[] args) {
		double area;
		double perimeter;
		double width;
		double length;
		String continue1;
		Boolean response = true;
		
		
		
	
		
		Scanner scnr = new Scanner(System.in);
		
		while (response == true){
		
		
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		System.out.println("Enter Length:");
		 length = scnr.nextDouble();
		System.out.println("Enter Width:");
		 width = scnr.nextDouble();
		 
		 area = (length * width);
		 perimeter = 2 * (length * width);
		 
		 System.out.println("Area: " + area);
		 System.out.println("Perimeter: " + perimeter);
		 
		 
		 System.out.println("Continue? (y/n): ");
		  continue1 = scnr.next();
		 
		 if (continue1.charAt(0) == 'y')
		 {
			 response = true;
		 }
		else {
		 
			 response = false;
			 System.out.println("Goodbye!");
		}
		}
	}
}


