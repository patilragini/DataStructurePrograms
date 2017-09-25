/* ***********************************************************************************************
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   11-9-2017
 *  @description :add the Text from a file, split it into words and arrange it as Linked List.
 *  				Take a user input to search a Word in the List. If the Word is not found 
 *  				then add it to the list, and if it found then remove the word from the List.
 *  				In the end save the list into a same file
 *  				
 *
 *************************************************************************************************/
package com.bridgelabz.programs;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class UnOrderedLinkedList {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		char again;
		// will enter do while loop once
		try {
			do {
				// search word eg city name from a text file
				System.out.println("Enter the city you want to search:");
				String word = scan.next();
				Utility.searchWordFromFile(word);
				System.out.println("Want to continue ?");
				again = scan.next().charAt(0);
			} while (again == 'y' || again == 'Y');// continue operarting linked
													// list till
		} catch (Exception e) {
			System.out.println("invalid input");
		}

	}
}
