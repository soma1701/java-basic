package com.soma.logical.main.linklist;

import java.io.File;
import java.util.Scanner;

import com.soma.logical.util.LinkList_Utility;
import com.soma.logical.util.Utility;

public class UsortedList {

	public static void main(String[] args) {
		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
		LinkList_Utility lu=new LinkList_Utility();
		File file=new File("java-basic/src/resource/test.txt");
		String[] words=u.FetchWordsFrom(file);
		System.out.println("fetching data from file:-");
		u.printStringArr(words);
		System.out.println("added to list:-");
		for(int i=0;i<words.length;i++){
			lu.insertAtEnd(words[i]);
		}
		lu.show();
		System.out.println("enter word to search in list:-");
		String search=sc.next();
		int result=lu.search(search);
		System.out.println(result);
		if(result==-1){
			System.out.println("word is not found in list and added to list");
			lu.insertAtStart(search);
			lu.show();
		}else{
			System.out.println("word is found at" +result+"and remove from list");
			lu.removeFromPosition(result);
			lu.show();

		}

     
	}

}
