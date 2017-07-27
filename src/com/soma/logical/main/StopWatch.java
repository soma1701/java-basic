package com.soma.logical.main;

import java.util.Date;
import java.util.Scanner;

import com.soma.logical.util.Utility;

public class StopWatch {
	public static void main(String[] a){
		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
		long startTime=0;
		long endTime=0;
		long elapsedTime=0;
		long start=u.startTime();
		System.out.println("StopWatch has been started, enter any no to stop");
		int b=sc.nextInt();
		long end=u.endTime();
		u.elapsedTime(start,end);
   }

}
