package com.soma.logical.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

import com.soma.logical.util.Utility;

public class BinarySearch {
	public static void main(String[] a) throws IOException{
		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
		File file=new File("src/resource/test.txt");
		String[] words=u.FetchWordsFrom(file);
		System.out.println("enter word to search from file:");
		String search=sc.next();
	 	int position=u.binarySearchString(words, 0, words.length, search);
	 	if(position==-1)
	 		System.out.println("word is not found from file:-");
	 	else
	 		System.out.println("word is found at position:"+(position+1));
	 	
	 	
	}
}
