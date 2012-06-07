package org.hamciuc.projecteuler.problems;

/**
 * Starting in the top left corner of a 2×2 grid, there are 6 routes (without
 * backtracking) to the bottom right corner.
 * 
 * How many routes are there through a 20×20 grid?
 * 
 * http://projecteuler.net/problem=15
 * 
 * @author Adrian
 * 
 */
public class Problem15 {

	public static void main(String[] args) {

		long[][] a = new long[21][21];
		a[0][0] = 0;
		// number of paths to points on the edges is 1
		for (int i = 0; i < 21; i++) {
			a[0][i] = a[i][0] = 1;
		}
		// Number of paths to a point is number of paths to point above + number
		// of paths to point to the left
		for (int i = 1; i < 21; i++) {
			for (int j = 1; j < 21; j++) {
				a[i][j] = a[i - 1][j] + a[i][j - 1];
			}
		}
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < 21; j++) {
			}
		}
		System.out.println("Result is " + a[20][20]);
	}
}
