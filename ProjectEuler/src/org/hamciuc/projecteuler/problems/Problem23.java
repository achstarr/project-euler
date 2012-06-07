package org.hamciuc.projecteuler.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * A perfect number is a number for which the sum of its proper divisors is
 * exactly equal to the number. For example, the sum of the proper divisors of
 * 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 * 
 * A number n is called deficient if the sum of its proper divisors is less than
 * n and it is called abundant if this sum exceeds n.
 * 
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest
 * number that can be written as the sum of two abundant numbers is 24. By
 * mathematical analysis, it can be shown that all integers greater than 28123
 * can be written as the sum of two abundant numbers. However, this upper limit
 * cannot be reduced any further by analysis even though it is known that the
 * greatest number that cannot be expressed as the sum of two abundant numbers
 * is less than this limit.
 * 
 * Find the sum of all the positive integers which cannot be written as the sum
 * of two abundant numbers.
 * 
 * 
 * http://projecteuler.net/problem=23
 * 
 * @author Adrian
 * 
 */
public class Problem23 {
	private static List<Integer> abundantNumbers = new ArrayList<Integer>();
	private static Set<Integer> okNumbers = new TreeSet<Integer>();

	/**
	 * Returns true if the given number is abundant, false otherwise.
	 * 
	 * @param x
	 * @return
	 */
	private static boolean isAbundant(int x) {
		int sum = 0;
		for (int d = 1; d <= x / 2; d++) {
			if (x % d == 0) {
				sum += d;
			}
		}
		return sum > x;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 28123; i++) {
			if (isAbundant(i)) {
				abundantNumbers.add(i);
			}
		}
		for (int i = 0; i < abundantNumbers.size(); i++) {
			for (int j = 0; j < abundantNumbers.size(); j++) {
				okNumbers.add(abundantNumbers.get(i) + abundantNumbers.get(j));
			}
		}
		int sum = 0;
		for (int i = 1; i < 28123; i++) {
			if (!okNumbers.contains(i)) {
				sum += i;
			}
		}
		System.out.println("Result is " + sum);
	}
}
