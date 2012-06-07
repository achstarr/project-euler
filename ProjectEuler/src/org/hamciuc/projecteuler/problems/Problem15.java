package org.hamciuc.projecteuler.problems;
public class Problem15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long[][] a = new long[21][21];
		a[0][0] = 0;
		for (int i = 0; i < 21; i++) {
			a[0][i] = a[i][0] = 1;
		}
		for (int i = 1; i < 21; i++) {
			for (int j = 1; j < 21; j++) {
				a[i][j] = a[i - 1][j] + a[i][j - 1];
			}
		}
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < 21; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
