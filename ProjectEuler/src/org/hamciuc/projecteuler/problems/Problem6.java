package org.hamciuc.projecteuler.problems;

public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sumOfSquares = 0;
		int squareOfSum = 50*101*50*101;
		for(int i=1;i<=100;i++){
			sumOfSquares +=i*i;
		}
		System.out.println("Result is " + Math.abs(sumOfSquares - squareOfSum));

	}

}
