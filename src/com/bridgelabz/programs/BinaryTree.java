/****************************************************************************** 
 *  Purpose: gives combinaion of binary tree combinations
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   1/09/2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinaryTree {

	public static void main(String[] args) {
		char again = 'y';
		Scanner scanner = new Scanner(System.in);
		try {
			do {
				
				System.out.println("Enter  number to get combination");
				int number = scanner.nextInt();
				int noOfTree = Utility.getNodes(number);
				System.out.println(noOfTree);
				System.out.println("do wnant to continue y/n ?:");
				again = scanner.next().charAt(0);
			
			} while (again == 'y' || again == 'Y');

		} catch (Exception e) {
			System.out.println("exception\n error!!!");
		}
		System.out.println("end!!!");
		scanner.close();
	}
}