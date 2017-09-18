package com.bridgelabz.utility;

import java.util.Scanner;

public class StackArray {
	
		private int Stack[];
		
		protected int top, size, len;
		public StackArray(int n){
		size = n;
		len = 0;
		Stack = new int[size];
		top=-1;
		}
		
		public boolean isEmpty() {
		return (top == -1);
		}    
		
		public boolean isFull() 
		{
		return top==size-1;
		} 
		
		public int getSize()
		{
		return len;
		}    
		
		public int pop() {
		
			if(top==-1){
				System.out.println("UNDERFLOW !!!");
			}
			else{
				top--;
				len--;
				}
			return Stack[top];		
			}
		
		public void push(int num){
				if(top<size){
					top++;
					len++;
					Stack[top]=num;
					}
			else
				System.out.println("OVER FLOW!!!");
		}
		public void display()
		{
			System.out.print("stack data :\n");
			if (len == 0){
			    System.out.print("Empty stack\n");
			}
			else{
				for(int i=top;i>=0;i--){
					 System.out.print(Stack[i]+" ");
				}
			}
		 
			}
		
	public static Scanner sc= new Scanner(System.in);
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		int num;
//		System.out.println("\n Do you want to perform action on queue \n Enter your choice y/n");
//		ch=sc.next().charAt(0);
		System.out.println(" Enter stack size");
		int len=sc.nextInt();
		StackArray stack=new StackArray(len);
		
		do{
			System.out.println("enter you choice\n 1 get size osf stack  \n 2push \n 3pop \n 4 Display stack");
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				int size=stack.getSize();
				System.out.println("size="+size);
				break;
			case 2:
				System.out.println("enter new element in stack:");
				num=sc.nextInt();
				System.out.println("pushed!!!");
				stack.push(num);
				break;
			case 3:
				int popitem=stack.pop();
				if(popitem==-1)
					System.out.println("");
				System.out.println("item at top"+popitem);
				break;
			case 4:
				stack.display();
				break;
			default:
				System.out.println("invalid ");
				}
			System.out.println("\n Do you want to continue y/n");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');*/
		

//	}

}
