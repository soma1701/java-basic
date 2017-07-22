package com.soma.logical;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
     System.out.println("Enter no to find out power of two:-");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if((n>0)&&(n<31)){
    int powerOfTwo= checkPowerOfTwo(n);
    System.out.println("Power of two is:-"+powerOfTwo);
    int table=checktable(powerOfTwo);
    System.out.println("table of Power of two is:-"+table);
    LeapYear leapyear=new LeapYear();
    leapyear.checkLeapYear(table);
    
	}
    
	}

	public static int checktable(int powerOfTwo) {
		int table=0;
		for(int i=1;i<=powerOfTwo;i++){
			table=powerOfTwo*i;
		}
		return table;
	}

	public static int checkPowerOfTwo(int n) {
		int powerOfTwo=1;
		if(n==0){
			powerOfTwo=1;
		}
		else{
		for(int i=0;i<n;i++){
			powerOfTwo =powerOfTwo*2 ;
		}
		}
		
		return powerOfTwo;
	    }

}
