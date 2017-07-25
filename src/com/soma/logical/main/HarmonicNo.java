package com.soma.logical.main;

import java.util.Scanner;

import com.soma.logical.util.Utility;

public class HarmonicNo{
	public static void main(String[] args)
	{
		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to fing out harmonic number");
		int n=sc.nextInt();
		if(n!=0)
		{
			u.findHarmonicNo(n);
		}
		else
		{
			System.out.println("Enter no is greater than zero:");
		}
	}


}


