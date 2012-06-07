package org.hamciuc.projecteuler.problems;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 * 
 * http://projecteuler.net/problem=5
 * 
 * @author Adrian
 * 
 */
public class Problem5 {

	public static void main(String[] args) {
		int result = 2520 * 11 * 13 * 2 * 17 * 19;
		System.out.println(result);
	}

}
