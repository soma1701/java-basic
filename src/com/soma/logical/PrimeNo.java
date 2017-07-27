package com.soma.logical;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] a){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to find out prime factorization:-");
        int n=sc.nextInt();
        checkPrimeNo(n);
//        PrimeFactorization(n);
	}

	public static boolean checkPrimeNo(int n) {
		boolean isPrimeNo=false;
		int count=0;
    	for(int i=1;i<n;i++){
    		if(n%i==0){
    			count++;
    			if(count==2)
    				return isPrimeNo=true;
    				else
    					return isPrimeNo;
    		}
    	}
    	return isPrimeNo;
	}
	public static void PrimeFactorization(int n) {
		for(int i=2;i<=n;i++){
			if(checkPrimeNo(i));
			System.out.print(i+" ");
		}
		
	}

}
