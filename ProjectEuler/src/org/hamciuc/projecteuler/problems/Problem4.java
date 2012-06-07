package org.hamciuc.projecteuler.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hamciuc.projecteuler.utils.ProblemUtils;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * http://projecteuler.net/problem=4
 * 
 * @author Adrian
 * 
 */
public class Problem4 {

	public static void main(String[] args) {
		List<Integer> palindromes = new ArrayList<Integer>();
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if (ProblemUtils.isPalindrome(i * j)) {
					palindromes.add(i * j);
				}
			}
		}
		Collections.sort(palindromes);
		Collections.reverse(palindromes);
		System.out.println("Result is " + palindromes.get(0));
	}

}
