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
		int wins=0,loose=0;
		int cashPrice = stake;
		for(int i=0;i<trials;i++)
		{
			if ((cashPrice > 0) && (cashPrice < goal)) {	
				bets++;
				if (Math.random() > 0.5){
					cashPrice++;
				    wins++;
				}
				else{
					cashPrice--;
				     loose++;
				}
			}
			else
				break;
		}

		System.out.println(wins+"wins of trials:"+trials);
		System.out.println(loose+"loose of trials"+trials);
		System.out.println("% of wins:-"+(wins*100)/trials);
		System.out.println("% of loose:-"+(loose*100)/trials);
		}
}

	


