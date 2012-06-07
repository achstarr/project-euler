package org.hamciuc.projecteuler.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n -> n/2 (n is even) 
 * n -> 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence: 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at 1)
 * contains 10 terms. Although it has not been proved yet (Collatz Problem), it
 * is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million. 
 * 
 * http://projecteuler.net/problem=14
 * 
 * @author Adrian
 * 
 */
public class Problem14 {

	/**
	 * Keeps already computed results. If we get to a number where we have already calculated the 
	 * chain length, we don't recalculate
	 */
	private	static Map<Integer, Integer> results = new HashMap<Integer, Integer>();

	/**
	 * Returns the length of a chain beginning at x
	 * @param x
	 * @return
	 */
	private static int length(long x) {
		int len = 0;
		while (x != 1) {
			if (results.get(x) != null) {
				return len + results.get(x);
			}
			if (x % 2 == 0) {
				x /= 2;
			} else {
				x = 3 * x + 1;
			}
			len++;
		}
		return len;
	}

	public static void main(String[] args) {
		int maxlength = 1;
		int maxnum = 1;
		results.put(1, 1);
		for (int i = 1; i < 1000000; i++) {
			int len = length(i);
			results.put(i, len);
			if (len > maxlength) {
				maxlength = len;
				maxnum = i;
				System.out.println("An increase to " + maxlength
						+ " for number " + maxnum);
			}
			if (i % 10000 == 0) {
				System.out.println("Reached " + i);
			}
		}
		System.out.println("Result is " + maxnum);
	}
}
