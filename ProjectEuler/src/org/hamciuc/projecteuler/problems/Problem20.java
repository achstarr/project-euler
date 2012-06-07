package org.hamciuc.projecteuler.problems;
import java.math.BigInteger;

public class Problem20 {

	/**
	 * @param args
	 */
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
