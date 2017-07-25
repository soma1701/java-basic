package com.soma.logical.main;

import java.util.Scanner;

import com.soma.logical.util.Utility;

public class Triplet {
	public static void main(String[] a){
		Utility u=new Utility();	
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter no of elements:");
	    int n=sc.nextInt();
	    int[] b=new int[n];
	    System.out.println("Enter" +n+ "elements");
	    for(int i=0;i<n;i++){
	    	b[i]=sc.nextInt();
	    }
	    	u.triplet(b,n);
	}

}