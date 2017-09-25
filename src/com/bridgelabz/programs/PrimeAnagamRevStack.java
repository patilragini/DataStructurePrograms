/* ***********************************************************************************************
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   11-9-2017
 *************************************************************************************************/
package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.StackArray;
import com.bridgelabz.utility.Utility;

public class PrimeAnagamRevStack {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> listanagram = new ArrayList<Integer>();

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
					listanagram.add(list.get(j));
				}
			}
		}

		System.out.println("\nAnagram numbers are :" + listanagram);
		System.out.println("Total number of anagram numbers are :" + listanagram.size());

		/*
		 * stack operations push to add elements pop to remove top most element
		 */
		StackArray array = new StackArray(listanagram.size());
		for (int i = 0; i < listanagram.size() - 1; i++) {
			array.push(listanagram.get(i));
		}
		System.out.println("reverse data =");
		array.display();
	}

}
