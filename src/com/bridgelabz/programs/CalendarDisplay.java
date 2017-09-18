/*************************************************
 *@author:Patil Ragini
 *@version: 1.8
 *@since: 19-08-2017
 *Purpose: Take month and year and Display calendar 
 **************************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CalendarDisplay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter month (1-12): ");
		int month = scanner.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("Invalid month. Valids scanners are 1(jan)-12(dec).");

		}
		System.out.print("Enter year : ");
		int year = scanner.nextInt();

		if (Utility.leap(year)) {
			System.out.println(year + " is a Leap year.");
		} else {
			System.out.println(year + " not a Leap year.");
		}
		Utility.firstDayOfYear(year);
		Utility.firstDayOfMonth(month, year);
		Utility.numDaysInMonth(month, year);
		Utility.printCal(month, year);
		scanner.close();
	}

}