package org.hamciuc.projecteuler.problems;
public class Problem12 {
	private static boolean over500Divs(long number) {
		int noDivs = 0;
		for (long i = 1; i < number / 2 + 1; i++) {
			if (number % i == 0) {
				noDivs++;
			}
		}
		return noDivs > 500;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long start = 28;
		int count = 7;
		while (!over500Divs(start)) {
			count++;
			start += count;
		}
		System.out.println("Result is " + start);

	}

}
