package org.hamciuc.projecteuler.problems;
import java.util.ArrayList;
import java.util.List;


public class Problem10 {

	private static boolean isPrime(int x, List<Integer> primes) {
		for(int i: primes) {
			if(x%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);		
		long sum = 2;
		int currentPrime = 3;
		while(currentPrime<2000000) {
			while(!isPrime(currentPrime, primes)) {
				currentPrime+=2;
			}
			primes.add(currentPrime);
			sum+=currentPrime;
		}
		sum-=currentPrime;
		System.out.println("Result is " + sum);
	}

}
