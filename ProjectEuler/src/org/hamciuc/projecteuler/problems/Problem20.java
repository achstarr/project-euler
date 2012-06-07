package org.hamciuc.projecteuler.problems;

import java.math.BigInteger;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * 
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, and the sum of the
 * digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 * 
 * http://projecteuler.net/problem=20
 * 
 * @author Adrian
 * 
 */
public class Problem20 {

	public static void main(String[] args) {
		BigInteger number = BigInteger.ONE;
		for (int i = 2; i <= 100; i++) {
			number = number.multiply(new BigInteger(Integer.toString(i)));
		}
		int sum = 0;
		for (char c : number.toString().toCharArray()) {
			sum += (c - '0');
		}
		System.out.println("Result is " + sum);
	}

}
