package org.hamciuc.projecteuler.problems;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * http://projecteuler.net/problem=1
 * 
 * @author Adrian
 * 
 */
public class Problem1 {

	public static void main(String[] args) {
		int sum = 0;
		// add all multiples of 5
		for (int i = 0; i < 1000; i += 5) {
			sum += i;
		}
		// add all multiples of 3 that weren't already added
		for (int i = 0; i < 1000; i += 3) {
			if (i % 5 != 0) {
				sum += i;
			}
		}
		System.out.println("Sum is " + sum);
	}

}
