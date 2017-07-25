package com.soma.logical;
import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] a)
	{
		
		String s="Hello username, How are you?";
		System.out.println("Enter user name");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		if(s1.length()>=3){
			String s2=s.replace("username", s1);
			System.out.println(s2);
		}
		else{
			System.out.println("You have to enter min 3 character");
		}
		
	}

}
