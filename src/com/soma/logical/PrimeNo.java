package com.soma.logical;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] a){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to find out prime factorization:-");
        int n=sc.nextInt();
        primeFactorization(n);
	}

	public static void check(int n) {
		int count=0;
    	for(int i=1;i<n;i++){
    		if(n%i==0){
    			count++;
    			if(count==2){
    				System.out.print(n+" ");
    			}
    		}
    	}
	}

}
