package com.soma.logical.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.soma.logical.util.HashLinkList;
import com.soma.logical.util.Utility;

public class HasahingFunction {
	public static void main(String[] a){
		Utility u=new Utility();
		ArrayList<Integer> al=new ArrayList<>();
		File file=new File("src/resource/HashingArray.txt");
		Scanner scnr;
		Scanner sc=new Scanner(System.in);
		try {
			scnr = new Scanner(file);
		
		while(scnr.hasNextLine()){
		
				al.add(Integer.parseInt(scnr.nextLine()));
		
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		HashLinkList[] arrLinkList=new HashLinkList[11];
		for(int i=0;i<11;i++){
			arrLinkList[i]=new HashLinkList();
		}
		for(int i=0;i<al.size();i++){
			int index=al.get(i)%11;
			u.insertAtStart(arrLinkList[index],al.get(i));
		}
		System.out.println("Enter no to search:");
		int data=sc.nextInt();
		int index=data%11;
		boolean isFound = u.search(data,arrLinkList[index]);
		System.out.println(isFound);
	}

}
