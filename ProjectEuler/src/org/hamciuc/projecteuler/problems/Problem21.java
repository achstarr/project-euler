package org.hamciuc.projecteuler.problems;

public class Problem21 {

	private static int sumOfDivisors(int x) {
		int sum = 0;
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i < 10000; i++) {
			int sumDivi = sumOfDivisors(i);
			if (sumOfDivisors(sumDivi) == i) {
				if (i < sumDivi) {
					sum += i + sumDivi;
				}
			}
		}
		System.out.println("Result is " + sum);
	}

}
