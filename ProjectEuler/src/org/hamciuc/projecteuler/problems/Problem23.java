package org.hamciuc.projecteuler.problems;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Problem23 {
	private static List<Integer> abundantNumbers = new ArrayList<Integer>();
	private static Set<Integer> okNumbers = new TreeSet<Integer>();

	private static boolean isAbundent(int x) {
		int sum = 0;
		for (int d = 1; d <= x / 2; d++) {
			if (x % d == 0) {
				sum += d;
			}
		}
		return sum > x;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 28123; i++) {
			if (isAbundent(i)) {
				abundantNumbers.add(i);
			}
		}
		for (int i = 0; i < abundantNumbers.size(); i++) {
			for (int j = 0; j < abundantNumbers.size(); j++) {
				okNumbers.add(abundantNumbers.get(i) + abundantNumbers.get(j));
			}
		}
		//System.out.println(okNumbers);
		int sum = 0;
		for (int i = 1; i < 28123; i++) {
			if (!okNumbers.contains(i)) {
				sum += i;
			}
		}
		System.out.println("Result is " + sum);
	}
}
