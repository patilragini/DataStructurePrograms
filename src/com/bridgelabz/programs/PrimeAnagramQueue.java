/* ***********************************************************************************************
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   11-9-2017
 *************************************************************************************************/
package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.QueueArray;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramQueue {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> listana = new ArrayList<Integer>();

		for (int i = 0; i < 1000; i++) {
			if (Utility.checkPrime(i)) {
				list.add(i);
			}
		}
		System.out.println("prime numbers are:" + list);
		System.out.println("Total number of prime numbers are:" + list.size());

		for (int j = 0; j < list.size() - 1; j++) {
			for (int k = j + 1; k < list.size() - 1; k++) {
				if (Utility.anagramChecker2(list.get(j), list.get(k))) {
					listana.add(list.get(j));
				}
			}
		}

		System.out.println("\nAnagram numbers are :" + listana);
		System.out.println("\nTotal number of anagram numbers are :" + listana.size());
		/* Queue operations */
		QueueArray queue = new QueueArray(listana.size());
		for (int i = 0; i < listana.size() - 1; i++) {
			queue.insert(list.get(i));
		}

		/*
		 * for(int i=0;i<listana.size()-1;i++){ queue.insert(list.get(i)); }
		 */
		System.out.println(" data in queue=");
		queue.display();

	}

}
