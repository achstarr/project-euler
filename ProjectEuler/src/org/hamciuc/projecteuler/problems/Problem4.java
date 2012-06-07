package org.hamciuc.projecteuler.problems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem4 {
	private static boolean isPalindrome(int x) {
		String xAsString = Integer.toString(x);
		StringBuffer sb = new StringBuffer(xAsString);
		return sb.reverse().toString().equals(xAsString);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> palindromes = new ArrayList<Integer>();
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if (isPalindrome(i * j)) {
					palindromes.add(i * j);
				}
			}
		}
		Collections.sort(palindromes);
		Collections.reverse(palindromes);
		System.out.println("Result is " + palindromes.get(0));
	}

}
