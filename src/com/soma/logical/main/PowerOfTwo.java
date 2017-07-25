package com.soma.logical.main;

import java.util.Scanner;

import com.soma.logical.util.Utility;

public class PowerOfTwo {

	public static void main(String[] args) {
	 Utility u=new Utility();
     System.out.println("Enter no to find out power of two:-");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if((n>0)&&(n<31)){
    int powerOfTwo=u.checkPowerOfTwo(n);
    System.out.println("Power of two is:-"+powerOfTwo);
    int table=u.checktable(powerOfTwo);
    System.out.println("table of Power of two is:-"+table);
    u.checkLeapYear(table);
    
	}
    
	}


}
