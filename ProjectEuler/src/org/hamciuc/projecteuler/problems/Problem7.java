package org.hamciuc.projecteuler.problems;

import java.util.ArrayList;
import java.util.List;

import org.hamciuc.projecteuler.utils.ProblemUtils;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 * http://projecteuler.net/problem=7
 * 
 * @author Adrian
 * 
 */
public class Problem7 {

	public static void main(String[] args) {
		// calculate all primes up to 10001 and displays the last one
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		int currentPrime = 3;
		for (int i = 1; i < 10001; i++) {
			while (!ProblemUtils.isPrime(currentPrime, primes)) {
				currentPrime++;
			}
			primes.add(currentPrime);
		}
		System.out.println("Result is " + primes.get(10000));
	}

}
