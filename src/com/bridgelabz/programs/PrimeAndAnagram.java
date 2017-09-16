package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class PrimeAndAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> listana=new ArrayList<Integer>();
		int a=0;
		for(int i=a;i<1000;i++) {            
	        if(Utility.checkPrime(i)) {
	        	list.add(i);        
	         }        
	     }
		System.out.println("prime numbers are:"+list);
		System.out.println("Total number of prime numbers are:"+list.size());
		
		for(int j=0;j<list.size()-1;j++){
			for(int k=j+1;k<list.size()-1;k++){
				if(Utility.anagramChecker2(list.get(j), list.get(k))){
					listana.add(list.get(j));
				}						
			}				
		}
		/*if(Utility.anagramChecker2D(list.get(6), list.get(19))){
			System.out.println("SAME");
		}*/	
		System.out.println("\nAnagram numbers are :"+listana);
		System.out.println("Total number of anagram numbers are :"+listana.size());
		
		ArrayList<ArrayList<Integer>> result=Utility.prime2d(listana );
		System.out.println("\n Anagram number  2D matrix is\n");
		
		/* display prime 2 D array*/
		for(int i=0;i<result.size();i++) {
			for(int j=0;j<result.get(i).size();j++) {
				System.out.format("%4d",result.get(i).get(j));
			}
			System.out.println();			
		}

	}
}
