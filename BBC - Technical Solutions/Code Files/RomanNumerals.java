/*
	The RomanNumerals class is used in order 
	for us to implement the 'generate' method
	from the RomanNumeralGenerator interface
*/

import java.util.HashMap;

public class RomanNumerals implements RomanNumeralGenerator {

	// Declare arrays to store roman numbers(roman) and their equivalent in arabic(base)
	private int[] base = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private String[] roman = {"M", "CM", "D", "CD", "C", "XC", "XL", "L", "X", "IX", "V", "IV", "I"};

	// Creating a HashMap to link the above elements
	private HashMap<Integer, String> map = new HashMap<Integer, String>();

	public String generate(int number) {
		String output = "";

		// Mapping the elements from base to roman
		for(int i = 0; i < base.length; i++) {
			map.put(base[i], roman[i]);
		} // for

		/* 
		   Check if number is in the constraints
		   and then add the correspounding roman
		   string to the output alongside the substraction
		   of the base number from the input
		*/
		for(int j : base) {
			while(number >= j) {
				if(number > 0 && number < 4000) {
					output += map.get(j);
					number -= j;
				} // if
				else {
					return "Invalid Input";
				} // else
			} // while
		}
		// Ouput Result
		return output;

	} // generate method

} // RomanNumeralGenerator