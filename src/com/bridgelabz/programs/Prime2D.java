/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   9-09-2017
 *	@description Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
 *				 Store the prime numbers in a 2D Array, the first dimension represents the
 *				 range 0-100, 100-200,and so on. While the second dimension represents the
 *				 prime numbers in that range
 ******************************************************************************/

package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class Prime2D {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	List<Integer> list=new ArrayList<>();
	int a=0;
	for(int i=a;i<1000;i++) {            
        if(Utility.checkPrime(i)) {
        	list.add(i);        
         }        
         }
		System.out.println("prime numbers are:"+list);
//		System.out.println(list.size());
		ArrayList<ArrayList<Integer>> result=Utility.prime2d(list );
		System.out.println("\nprime number 2D matrix is\n");
		/* display prime 2 D array*/
		for(int i=0;i<result.size();i++) {
			for(int j=0;j<result.get(i).size();j++) {
				System.out.format("%4d",result.get(i).get(j));
			}
			System.out.println();
}
}
}
