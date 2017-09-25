/* ***********************************************************************************************
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   11-9-2017
 *  @description :	Read .a List of Numbers from a file and arrange it ascending Order in 
 *  				a Linked List. Take user input for a number, if found then pop the number
 *   				out of the list else insert the number in appropriate position
 *
 *************************************************************************************************/
package com.bridgelabz.programs;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class orderedList {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException, IndexOutOfBoundsException {
		char choice;
		// will enter do while loop once
		do {
			System.out.println("Enter the number you want to search :");
			int number = scan.nextInt();
			Utility.searchIntFromFile(number);
			System.out.println("Want to continue y/n ?");
			choice = scan.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');// continue operarting linked
													// list till 'y'

	}

}
