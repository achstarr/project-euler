package org.hamciuc.projecteuler.problems;

import java.math.BigInteger;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 * 
 * http://projecteuler.net/problem=16
 * 
 * @author Adrian
 * 
 */
public class Problem16 {

	public static void main(String[] args) {

		int sum = 0;
		for (char c : BigInteger.ONE.shiftLeft(1000).toString().toCharArray()) {
			sum += c - '0';
		}
		System.out.println("Result is " + sum);
	}

}
