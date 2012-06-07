package org.hamciuc.projecteuler.problems;
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			System.out.println(letterTranslate(i));
			count += letterTranslate(i).length();
		}
		System.out.println("Result is " + count);
	}

}
