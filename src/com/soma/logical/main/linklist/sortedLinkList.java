package com.soma.logical.main.linklist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.soma.logical.util.Utility;

public class sortedLinkList {
	public static void main(String[] a) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		File file=new File("src/resource/test.txt");
		Scanner scnr=new Scanner(file);
		Utility u=new Utility();
		int[] ar=new int[100];
		int i=0;
		while(scnr.hasNext()){
			ar[i]=scnr.nextInt();
			i++;
		}u.printIntArray(ar);
	
		}
		
		
	}


