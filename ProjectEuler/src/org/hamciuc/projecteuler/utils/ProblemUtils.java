package org.hamciuc.projecteuler.utils;

import java.util.List;

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
	 * @param numberToCheck
	 *            - the number to check
	 * @return - true if the given number is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(int numberToCheck) {
		String numberAsString = Integer.toString(numberToCheck);
		StringBuffer sb = new StringBuffer(numberAsString);
		return sb.reverse().toString().equals(numberAsString);

	}

	/**
	 * Returns true if the number given as first argument is prime, false
	 * otherwise. Requires a list of all primes smaller than the given number.
	 * 
	 * @param numberToCheck
	 *            - the number to check
	 * @param primes
	 *            - list of primes found so far
	 * @return true if the given number is a prime, false otherwise
	 */
	public static boolean isPrime(int numberToCheck, List<Integer> primes) {
		for (int i : primes) {
			if (numberToCheck % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns the sum of divisors for the given number x
	 * 
	 * @param x
	 *            the number for which we want the sum of divisors
	 * @return the sum of divisors for that number
	 */
	public static int sumOfDivisors(int x) {
		int sum = 0;
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
