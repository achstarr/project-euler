package org.hamciuc.projecteuler.problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file
 * containing over five-thousand first names, begin by sorting it into
 * alphabetical order. Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name
 * score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is
 * worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN
 * would obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 * 
 * 
 * http://projecteuler.net/problem=22
 * 
 * @author Adrian
 * 
 */
public class Problem22 {

	/**
	 * Returns the score for a given name
	 * @param name
	 * @return
	 */
	private static int scoreForName(String name) {
		int score = 0;
		for (char c : name.toCharArray()) {
			if (c != '"') {
				score += c - 'A' + 1;
			}
		}
		return score;
	}

	public static void main(String[] args) throws Exception {
		String names = new BufferedReader(
				new FileReader(
						"E:\\Self-Projects\\ProjectEuler\\ProjectEuler\\src\\problem22.txt"))
				.readLine();
		String[] namesArray = names.split(",");
		Arrays.sort(namesArray);
		long score = 0;
		for (int i = 0; i < namesArray.length; i++) {
			score += (i + 1) * scoreForName(namesArray[i]);
		}
		System.out.println("Result is " + score);
	}

}
