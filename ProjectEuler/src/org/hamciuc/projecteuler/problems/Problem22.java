package org.hamciuc.projecteuler.problems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Problem22 {

	private static int scoreForName(String name) {
		int score = 0;
		for (char c : name.toCharArray()) {
			if (c != '"') {
				score += c - 'A' + 1;
			}
		}
		return score;
	}

	/**
	 * @param args
	 */
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
