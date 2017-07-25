package com.soma.logical.main;
import java.util.Scanner;

import com.soma.logical.util.Utility;

public class ReplaceString {
	public static void main(String[] a)
	{   Utility u=new Utility();
		System.out.println("Enter user name");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		u.replaceString(s1);
	}
	

}
