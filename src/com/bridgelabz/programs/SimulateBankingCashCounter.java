/* ***********************************************************************************************
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   11-9-2017
 *  @description Create a Program which creates Banking Cash Counter where 
 *  		     people come in to deposit Cash and withdraw Cash. Have an input panel to add
 * 		 		 people to Queue to either deposit or withdraw money and dequeue the people.
 *  			 Maintain the Cash Balance.
 *
 *************************************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.QueueArray;
import com.bridgelabz.utility.Utility;

public class SimulateBankingCashCounter {
	public static Scanner scanner = new Scanner(System.in);
	public static int cash = 10000;

	public static void main(String[] args) {

		SimulateBankingCashCounter sb = new SimulateBankingCashCounter();
		System.out.println("ENTER NUMBR OF PEOPLE IN QUEUE/n");
		int people = scanner.nextInt();
		sb.peopleQueue(people);
		System.out.println("Available balance in bank :" + cash);

	}

	void peopleQueue(int people) {
		QueueArray queue = new QueueArray(people);
		int choice;
		int i = 0, j = 0;
		while (i < people) {
			queue.insert(i);
			i++;
		}
		while (j < people) {
			System.out.println(" Person " + (j + 1) + " \n 1.Withdraw \n 2.Deposite");
			choice = scanner.nextInt();
			if (choice == 1) {
				queue.remove();
				Utility.withdraw(cash);

			} else if (choice == 2) {
				queue.remove();
				Utility.deposite(cash);
			}
			j++;
		}
	}

}