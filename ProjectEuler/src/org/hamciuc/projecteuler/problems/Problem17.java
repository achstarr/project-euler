package org.hamciuc.projecteuler.problems;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out
 * in words, how many letters would be used?
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
 * forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20
 * letters. The use of "and" when writing out numbers is in compliance with
 * British usage.
 * 
 * http://projecteuler.net/problem=17
 * 
 * @author Adrian
 * 
 */
public class Problem17 {
	static String[] singleDigits = { "", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine" };
	static String[] ten = { "", "ten", "twenty", "thirty", "forty", "fifty",
			"sixty", "seventy", "eighty", "ninety" };
	static String[] teens = { "ten", "eleven", "twelve", "thirteen",
			"fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };
	static String hundred = "hundred";
	static String and = "and";
	static String thousand = "thousand";

	static String letterTranslate(int number) {
		String word = "";
		if (number == 1000) {
			word = singleDigits[1] + thousand;
			return word;
		}
		int hundreds = number / 100;
		if (hundreds > 0) {
			word += singleDigits[hundreds] + hundred;
			if (number % 100 != 0) {
				word += and;
			}
		}
		int tens = number % 100 / 10;
		if (tens > 1) {
			word += ten[tens];
		}
		if (tens == 1) {
			word += teens[number % 10];
		} else {
			word += singleDigits[number % 10];
		}
		return word;
	}

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			count += letterTranslate(i).length();
		}
		System.out.println("Result is " + count);
	}

}
