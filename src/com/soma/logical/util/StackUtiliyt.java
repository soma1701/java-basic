package com.soma.logical.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.soma.logical.main.StackImpl;

public class StackUtiliyt {

	public static void main(String[] a) {
		Scanner scnr=null;
		StringBuilder sb=new StringBuilder();		
		File file=new File("src/resource/stack.txt");
		try {
			scnr=new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		while(scnr.hasNext()){
			sb.append(scnr.nextLine());
			
		}
		StackImpl stackimpl=new StackImpl(sb.length());
		char[] c=new char[sb.length()];
		c=sb.toString().toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]=='('){
				stackimpl.insert('(');
			}
			else if(c[i]==')'){
				stackimpl.delete();
			}
		}
		if(stackimpl.isstackEmpty()){
			System.out.println("Arithmatic expression is balance:");
		}else{
			System.out.println("not balanced");
		}
		
		scnr.close();
		
	}

}
