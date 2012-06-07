package org.hamciuc.projecteuler.problems;

/**
 * The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... +
 * 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... +
 * 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * http://projecteuler.net/problem=6
 * 
 * @author Adrian
 * 
 */
public class Problem6 {

	public static void main(String[] args) {
		int sumOfSquares = 0;
		int squareOfSum = 50 * 101 * 50 * 101;
		for (int i = 1; i <= 100; i++) {
			sumOfSquares += i * i;
		}
		System.out.println("Result is " + Math.abs(sumOfSquares - squareOfSum));

	}

}
