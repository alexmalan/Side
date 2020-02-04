/* 	
	The Test class is used to test the 
	RomanNumerals class. The user is able to
	input any number or character, but the
	result will only be returned if the constraints 
	are respected
*/

import java.util.Scanner;

class Test {
	public static void main(String[] args)
		{
			// Check if there is invalid input
			try {
				RomanNumerals ro = new RomanNumerals();
				Scanner sc = new Scanner(System.in);

				// Asking user to input a number
				System.out.println("Enter number to be converted: ");
				int number = sc.nextInt();
				String roman = ro.generate(number);

				// Returning the roman number
				System.out.println(number + " = " + "\"" + roman + "\"");
			}  
			catch (Exception e) {
				System.out.println("Something went Wrong");
			}
		} // main
} // Test