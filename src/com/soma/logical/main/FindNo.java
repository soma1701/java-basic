package com.soma.logical.main;

import java.util.Scanner;

import com.soma.logical.util.Utility;

public class FindNo {
 public static void main(String[] a) {
	 Scanner sc=new Scanner(System.in); 
	 Utility u=new Utility();
	 System.out.println("Enter no to guess:-");
	 int n=sc.nextInt();
	 int pow=u.checkPowerOfTwo(n);
	 System.out.println("Enter guess no:-");
	 int guessNo=sc.nextInt();
	 foundNo(0,pow,guessNo){
		 
	 
	
}
}

private static void foundNo(int i, int pow, int guessNo) {

 int mid=(i+pow)/2;
 if(guessNo==mid){
	 System.out.println("found");
 }
 else if(guessNo>mid){
	 foundNo(mid+1, pow, guessNo);
 }
 
}
	