package org.hamciuc.projecteuler.problems;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 * 
 * 
 * http://projecteuler.net/problem=9
 * 
 * @author Adrian
 * 
 */
public class Problem9 {

	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				if (i * i + j * j == (1000 - i - j) * (1000 - i - j)) {
					System.out.println("Result is " + (i * j * (1000 - i - j)));
				}
			}
		}
	}

}
