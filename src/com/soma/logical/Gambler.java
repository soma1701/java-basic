package com.soma.logical;

import java.util.Scanner;

public class Gambler {
	public static void main(String[] a){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stake amount:-");
		int stake=sc.nextInt();
		System.out.println("Enter no of trials:-");
		int trials=sc.nextInt();
		System.out.println("Enter your goal:-");
		int goal=sc.nextInt();
		int bets=0;
		int wins=0;
		for(int i=0;i<trials;i++)
			{
				int cashPrice=stake;
				while((cashPrice>0) &&(cashPrice<goal))
					{
						bets++;
						if(Math.random()>0.5)
							cashPrice++;
							else
								cashPrice--;
						}
					if(cashPrice==goal){
						wins++;
					}
					
				}
			
			System.out.println(wins+"wins of trials:"+trials);
			System.out.println("percentageof wins:-"+100*wins/trials);
			System.out.println("avg"+1*bets/trials);
		}
}

	


