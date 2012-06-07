package org.hamciuc.projecteuler.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * A permutation is an ordered arrangement of objects. For example, 3124 is one
 * possible permutation of the digits 1, 2, 3 and 4. If all of the permutations
 * are listed numerically or alphabetically, we call it lexicographic order. The
 * lexicographic permutations of 0, 1 and 2 are:
 * 
 * 012 021 102 120 201 210
 * 
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4,
 * 5, 6, 7, 8 and 9?
 * 
 * http://projecteuler.net/problem=24
 * 
 * @author Adrian
 * 
 */
public class Problem24 {
	static int SIZE = 10;
	static List<String> perms;
	static int[] currentPerm = new int[SIZE];

	/**
	 * Returns true if the given permutation is valid
	 * 
	 * @param perm
	 * @param k
	 * @return
	 */
	private static boolean validateCurrentPerm(int[] perm, int k) {
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

	/**
	 * Classic backtracking to generate all permutations. TODO optimize
	 * 
	 * @param k
	 */
	private static void back(int k) {
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

	public static void main(String[] args) {
		int tenFact = 1;
		for (int i = 2; i < 11; i++) {
			tenFact *= i;
		}
		int rank = 1000000 % tenFact - 1;
		perms = new ArrayList<String>(tenFact);
		back(0);
		System.out.println("Result is " + perms.get(rank));
	}

}
