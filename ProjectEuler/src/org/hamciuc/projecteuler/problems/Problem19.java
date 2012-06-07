package org.hamciuc.projecteuler.problems;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Problem19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar current = new GregorianCalendar();
		current.set(Calendar.DAY_OF_MONTH, 1);
		current.set(Calendar.YEAR, 1901);
		current.set(Calendar.MONTH, 0);

		Calendar end = new GregorianCalendar();
		end.set(Calendar.DAY_OF_MONTH, 1);
		end.set(Calendar.YEAR, 2001);
		end.set(Calendar.MONTH, 0);
		int count = 0;
		while (current.before(end)) {
			if (current.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				count++;
			}
			current.add(Calendar.MONTH, 1);
		}
		System.out.println("Result is " + count);
	}

}
