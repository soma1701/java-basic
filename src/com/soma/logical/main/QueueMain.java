package com.soma.logical.main;

import java.util.Scanner;

import com.soma.logical.util.QueueUtility;

public class QueueMain {
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		QueueUtility q=new QueueUtility();
		int ch = 0;
		do
		{ 
			System.out.println();
		   	System.out.println("------------Banking Cash Counter-----------");
		   	System.out.println("1.Deposit");
		   	System.out.println("2.Withdraw");
		   	System.out.println("3.Number of people in the Queue ");
		   	System.out.println("4.Exit");
		   	System.out.println();
		   	System.out.println("Enter your choice: ");
		   	int choice=sc.nextInt();
		   	switch (choice) 
		   	{
		   	case 1:
			   		System.out.println("Enter the amount you want to Deposit");
			   		int deposit=sc.nextInt();
			   		q.insert(deposit); 
			   		q.display();
			   		break;
		   	case 2:
			   		System.out.println("Enter the amount you want to Withdraw ");
			   		int withdraw=sc.nextInt();;
			   		q.remove();
			   		System.out.println(" Your Available Balance is: "); 
			   		q.display();
			   		break;
			case 3:
					int j=q.getSize();
					System.out.println("The Number of People in Queue is: "+j);	
					break;
		   	case 4:
			   		System.exit(0);
			   		break;
		   	default: 
			   		System.out.println("You entered wrong choice");
			   		break;
		   	}
	   	}
		while(ch<5);
	}	

}
