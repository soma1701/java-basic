package com.soma.logical;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
     System.out.println("Enter no to find out power of two:-");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if((n==0)&&(n<=31)){
    int powerOfTwo= checkPowerOfTwo(n);
    checktable(powerOfTwo);
	}
     else
     {
    	 System.out.println("please enter between 0 to 31");
     }
	}

	private static void checktable(int powerOfTwo) {
		int table=0;
		for(int i=1;i<=powerOfTwo;i++){
			table=powerOfTwo*i;
		}
		System.out.println("");
	}

	private static int checkPowerOfTwo(int n) {
		int powerOfTwo=0;
		if(n==0){
			powerOfTwo=1;
		}
		else{
		for(int i=1;i<=n;i++){
			powerOfTwo = 2*n;
		}
		}
		
		return powerOfTwo;
	}

}
