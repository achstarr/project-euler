package org.hamciuc.projecteuler.problems;

import java.util.ArrayList;
import java.util.List;

import org.hamciuc.projecteuler.utils.ProblemUtils;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 * http://projecteuler.net/problem=10
 * 
 * @author Adrian
 * 
 */
public class Problem10 {

	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		long sum = 2;
		int currentPrime = 3;
		while (currentPrime < 2000000) {
			while (!ProblemUtils.isPrime(currentPrime, primes)) {
				currentPrime += 2;
			}
			primes.add(currentPrime);
			sum += currentPrime;
		}
		//compensate for the extra prime
		sum -= currentPrime;
		System.out.println("Result is " + sum);
	}

}
