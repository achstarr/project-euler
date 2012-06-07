package org.hamciuc.projecteuler.problems;
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		int prevFib = 1;
		int currentFib = 2;
		while (currentFib <= 4000000) {
			if (currentFib % 2 == 0) {
				sum += currentFib;
			}
			int nextFib = prevFib + currentFib;
			prevFib = currentFib;
			currentFib = nextFib;
		}
		System.out.println("Result is " + sum);
	}

}
