package com.soma.logical.main.linklist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.soma.logical.util.LinkList_Utility;
import com.soma.logical.util.Utility;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class sortedLinkList {
	public static void main(String[] a) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		File file=new File("src/resource/test.txt");
		Scanner scnr=new Scanner(file);
		Utility u=new Utility();
		LinkList_Utility lu=new LinkList_Utility();
		ArrayList<Integer> al=new ArrayList<>();
		while(scnr.hasNext()){
			al.add(scnr.nextInt());
		}
//		in java8 we can sort in single line by lamda expresion
		
		al.sort((p1, p2) -> p1.compareTo(p2));
		
	    
		for(int i=0;i<al.size();i++){
		 lu.insertAtEnd(Integer.toString(al.get(i)));
		}
		System.out.println("enter no to search:-");
		int n=sc.nextInt();
			int found=lu.search(Integer.toString(n));
			if(found==-1){
				System.out.println("no is not found and inserted to linklist");
				int sortedPosition=lu.fetchPosition(n);
				lu.insertAtPosition(String.valueOf(n), sortedPosition);
				} else{
				  System.out.println("no is found at:-" +found +"and remove from position");
				  lu.removeFromPosition(found);
			}
			lu.show();
	scnr.close();
		
		
		
	}
}


