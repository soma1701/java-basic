package com.soma.logical.main;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

import com.soma.logical.util.Utility;

public class Regex {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Utility u=new Utility();
		File file=new File("src/resource/Regex.txt");

		UserDetails user=new UserDetails();
		System.out.println();
	
		//asking user to enter his data
		System.out.println("Enter FirstName:");
		user.setfName(sc.nextLine());
		System.out.println();
	
		System.out.println("Enter LastName:");
		user.setlName(sc.nextLine());
		System.out.println();
	
		System.out.println("Enter Mobile Number:");
		user.setmobileNo(sc.nextLine());
		System.out.println();	
		
		//Setting current date
		user.setdate(u.getFormatedDate(new Date()));
		System.out.println(u.convertString(user,u.FetchDataFromFile(file)));	
	}

}
