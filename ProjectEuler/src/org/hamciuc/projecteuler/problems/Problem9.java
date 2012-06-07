package org.hamciuc.projecteuler.problems;

public class Problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1;i<1000;i++){
			for (int j=1;j<1000;j++) {
				if(i*i + j*j == (1000-i-j)*(1000-i-j)) {
					System.out.println("Result is " + (i*j*(1000-i-j)));
				}
			}
		}
	}

}
