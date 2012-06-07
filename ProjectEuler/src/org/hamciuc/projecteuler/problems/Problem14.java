package org.hamciuc.projecteuler.problems;
import java.util.HashMap;
import java.util.Map;

public class Problem14 {

	static Map<Integer, Integer> results=new HashMap<Integer,Integer>();

	static int length(long x) {
		int len = 0;
		while (x != 1) {
			if (results.get(x) != null) {
				return len + results.get(x);
			}
			if (x % 2 == 0) {
				x /= 2;
			} else {
				x = 3 * x + 1;
			}
			len++;
		}
		return len;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxlength = 1;
		int maxnum = 1;
		results.put(1,1);
		for (int i = 1; i < 1000000; i++) {
			int len = length(i);
			results.put(i, len);
			if (len > maxlength) {
				maxlength = len;
				maxnum = i;
				System.out.println("An increase to " + maxlength
						+ " for number " + maxnum);
			}
			if(i%10000==0) {
				System.out.println("Reached " + i);
			}
		}
		System.out.println("Result is " + maxnum);
	}
}
