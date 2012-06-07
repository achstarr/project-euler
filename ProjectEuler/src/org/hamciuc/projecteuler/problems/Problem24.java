package org.hamciuc.projecteuler.problems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem24 {
	static int SIZE = 10;
	static List<String> perms;
	static int[] currentPerm = new int[SIZE];

	static boolean validateCurrentPerm(int[] perm, int k) {
		if (k == 0) {
			return true;
		}
		for (int i = 0; i <= k - 1; i++) {
			for (int j = i + 1; j <= k; j++) {
				if (perm[i] == perm[j]) {
					return false;
				}
			}
		}
		return true;
	}

	static void back(int k) {
		for (int i = 0; i < SIZE; i++) {
			currentPerm[k] = i;
			if (validateCurrentPerm(currentPerm, k)) {
				if (k == SIZE - 1) {
					String currentPermString = "";
					for (int t : currentPerm) {
						currentPermString += t;
					}
					perms.add(currentPermString);
				} else {
					back(k + 1);
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int tenFact = 1;
		for (int i = 2; i < 11; i++) {
			tenFact *= i;
		}
		int rank = 1000000 % tenFact-1;
		perms = new ArrayList<String>(tenFact);
		back(0);
		System.out.println("Result is " + perms.get(rank));
	}

}
