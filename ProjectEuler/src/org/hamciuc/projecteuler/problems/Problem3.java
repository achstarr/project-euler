package org.hamciuc.projecteuler.problems;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * http://projecteuler.net/problem=3
 * 
 * @author Adrian
 * 
 */
public class Problem3 {

	public static void main(String[] args) {
		long number = 600851475143l;
		long currentPrime = 2;
		while (number != 1) {
			if (number % currentPrime++ == 0) {
				number /= currentPrime;
			}
			currentPrime++;
		}
		// compensate for the extra increment after the result was found
		currentPrime--;
		System.out.println("Result is " + currentPrime);
	}
}
