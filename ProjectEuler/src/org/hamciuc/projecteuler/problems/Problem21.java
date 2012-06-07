package org.hamciuc.projecteuler.problems;

import org.hamciuc.projecteuler.utils.ProblemUtils;

/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
 * which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a
 * and b are an amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
 * 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4,
 * 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 * 
 * 
 * http://projecteuler.net/problem=21
 * 
 * @author Adrian
 * 
 */
public class Problem21 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i < 10000; i++) {
			int sumDivi = ProblemUtils.sumOfDivisors(i);
			if (ProblemUtils.sumOfDivisors(sumDivi) == i) {
				if (i < sumDivi) {
					sum += i + sumDivi;
				}
			}
		}
		System.out.println("Result is " + sum);
	}

}
