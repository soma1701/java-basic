package com.soma.logical;

import java.util.Scanner;

public class HarmonicNo{
	 public static void main(String[] args)
	 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number to fing out harmonic number");
	  int n=sc.nextInt();
	  if(n!=0)
	  {
	  findHarmonicNo(n);
	  }
	  else
	  {
	   System.out.println("Enter no is greater than zero:");
	   }
	}
	 
	   public  static void findHarmonicNo(int n)
	   {
	    int harmonicNo=0;
	    for(int i=1;i<=n;i++)
	    {
	    System.out.print("1"+"/"+i+"+");
	    }
	   }
}


