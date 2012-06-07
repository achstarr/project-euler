package org.hamciuc.projecteuler.utils;

/**
 * Contains various utility methods called in several problems.
 * 
 * @author Adrian
 * 
 */
public class ProblemUtils {
	/**
	 * Returns true if the number to be verified is a palindrome, false
	 * otherwise. TODO: optimize
	 * 
	 * @param x
	 * @return
	 */
	public static boolean isPalindrome(int x) {
		String xAsString = Integer.toString(x);
		StringBuffer sb = new StringBuffer(xAsString);
		return sb.reverse().toString().equals(xAsString);

	}
}
