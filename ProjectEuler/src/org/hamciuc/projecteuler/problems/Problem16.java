package org.hamciuc.projecteuler.problems;
import java.math.BigInteger;

public class Problem16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int sum = 0;
		for (char c : BigInteger.ONE.shiftLeft(1000).toString().toCharArray()) {
			sum += c - '0';
		}
		System.out.println("Sum is " + sum);
	}

}
