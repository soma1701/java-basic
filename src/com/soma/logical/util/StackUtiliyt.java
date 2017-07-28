package com.soma.logical.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.soma.logical.main.StackImpl;

public class StackUtiliyt {

	public static void main(String[] a) {
		Scanner scnr=null;
		StringBuilder sb=new StringBuilder();
		char[] c=new char[sb.length()];
		Utility u=new Utility();
		StackImpl stackimpl=new StackImpl(c.length);
//		StackArr[] stackArr=new StackArry[];
		
		try {
			scnr=new Scanner(new File("java-basic/src/resource/test.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		while(scnr.hasNext()){
			sb.append(scnr.nextLine());
			
		}
		c=sb.toString().toCharArray();
		
		stackimpl.insert(c);
		stackimpl.show();
		
		
	}

}
