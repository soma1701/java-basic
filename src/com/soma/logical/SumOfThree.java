package com.soma.logical;

import java.util.Scanner;

public class SumOfThree {
	public static void main(String[] a){
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter no of elements:");
	    int n=sc.nextInt();
	    int[] b=new int[n];
	    System.out.println("Enter" +n+ "elements");
	    for(int i=0;i<n;i++){
	    	b[i]=sc.nextInt();
	    }
	    	triplet(b,n);
	    
	}
	    public static void triplet(int[] b,int n){
	    	int count=0;
	    	for(int i=0;i<n;i++){
	    		for(int j=i+1;j<n-1;j++){
	    			for(int k=j+1;k<n-2;k++){
	    				if(b[i]+b[j]+b[k]==0){
	    					System.out.println(b[i]+" "+b[j]+" "+b[k]);
	    					count++;
	    				}
	    			}
	    		}
	    	}
	    System.out.println("no of distinct triplet is:"+count);	
	    
	}

}

