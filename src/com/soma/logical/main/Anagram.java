package com.soma.logical.main;

import java.util.Scanner;

import com.soma.logical.util.Utility;

public class Anagram {
	public static void main(String[] a){
		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String:-");
		String s=sc.nextLine();
		System.out.println("Enter second String:-");
		String s1=sc.nextLine();
		u.checkAnagram(s,s1);
	}

}
