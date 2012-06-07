package org.hamciuc.projecteuler.problems;
import java.util.ArrayList;
import java.util.List;


public class Problem7 {
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
		int currentPrime = 3;
		for(int i=1;i<10002;i++) {
			while(!isPrime(currentPrime, primes)) {
				currentPrime ++;
			}
			primes.add(currentPrime);
		}
		System.out.println(primes);
	}

}
