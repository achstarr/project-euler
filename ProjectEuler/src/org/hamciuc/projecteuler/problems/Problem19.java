package org.hamciuc.projecteuler.problems;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * You are given the following information, but you may prefer to do some
 * research for yourself.
 * 
 * 1 Jan 1900 was a Monday. Thirty days has September, April, June and November.
 * All the rest have thirty-one, Saving February alone, Which has twenty-eight,
 * rain or shine. And on leap years, twenty-nine. A leap year occurs on any year
 * evenly divisible by 4, but not on a century unless it is divisible by 400.
 * 
 * How many Sundays fell on the first of the month during the twentieth century
 * (1 Jan 1901 to 31 Dec 2000)?
 * 
 * 
 * http://projecteuler.net/problem=19
 * 
 * @author Adrian
 * 
 */
public class Problem19 {

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
