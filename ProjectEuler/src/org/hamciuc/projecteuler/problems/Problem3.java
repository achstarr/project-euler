package org.hamciuc.projecteuler.problems;
public class Problem3 {

	private static long nextPrime(long currentPrime) {
		return currentPrime + 1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long number = 600851475143l;
		long currentPrime = 2;
		while (number != 1) {
			if (number % currentPrime == 0) {
				number /= currentPrime;
			}
			currentPrime = nextPrime(currentPrime);
		}
		System.out.println("Result is " + currentPrime);
	}
}
