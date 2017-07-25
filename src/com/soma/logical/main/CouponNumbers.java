package com.soma.logical;


import java.util.Random;
import java.util.Scanner;

public class CouponNumbers{
	public static int generateRandomCoupon(int n){
		Random r=new Random();
	return r.nextInt(n);
		
	}
	public static int collect(int n){
		int counter=0;
		int distinctValue=0;
		boolean[] collectedvalue=new boolean[n];
		while(distinctValue<n){
			int v=generateRandomCoupon(n);
			counter++;
			if(collectedvalue[v]){
				distinctValue++;
				collectedvalue[v]=true;
			}
		}
		return counter++;
			}
			public static void main(String[] a){
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter no");
				int n=sc.nextInt();
				System.out.println(generateRandomCoupon(n));
				int counter=collect(n);
				System.out.println(counter);
		
	}
	
	
	
	
	
}	
       
//        public static void main(String[] c){	
//    	Scanner sc=new Scanner(System.in);
//    	int n= sc.nextInt();
//    	Random a= new Random();
//    	int b=a.nextInt(n);
//    	System.out.println(b);
//    	int[] d=new int[n];
//    	for(int i=0;i<n;i++){
//    		d[i]=a.nextInt(n );
//    		System.out.println(d[i]);
//    		
//    	}
//       
//		}

    
	

 
