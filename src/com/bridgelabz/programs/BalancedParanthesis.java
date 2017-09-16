/* ***********************************************************************************************
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   11-9-2017
 *  @description :  Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6) ∗(7+8)/(4+3)
 *   				where parentheses are used to order the performance of operations.
 *   				Ensure parentheses must appear in a balanced fashion
 *
 *************************************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
	public static Scanner scan=new Scanner(System.in);
	public static int octr=0;
	private static int cctr=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("enter expression");
		String exp=scan.next();
		int len=exp.length();
		for(int i=0;i<len;i++){
			char ch=exp.charAt(i);
			if(ch=='('){
				stack.push(i);
				octr++;
				System.out.println("("+i);
			}
				else if(ch==')'){
					cctr++;
					do{
						System.out.println(")"+i);
						stack.pop();
					}while(ch=='(');
					
				}
				else{
					stack.push(i);
				}
			}
		if(octr==cctr){
		System.out.println("TRUE :EQUAL AND BALANCED PARANTHESES");
		}
		else System.out.println("FALSE: UNEQUAL PARANTHESIS");
		}	
	}
		
	


