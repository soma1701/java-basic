package com.soma.logical.main;

import java.io.File;
import java.util.Scanner;

import com.soma.logical.util.Queue;
import com.soma.logical.util.Utility;

public class PallindromeChecker {
	public static void main(String[] a){
		boolean isPallindrome=false;
		File file=new File("src/resource/Queue.txt");
		Scanner sc=new Scanner(System.in);
		Utility objUtility=new Utility();
		String fileInput=objUtility.FetchDataFromFile(file);
		String[] arrInput=fileInput.split(" ");
		Queue objQueue=new Queue(arrInput.length);
		for(int i=0;i<arrInput.length;i++){
			objUtility.enqueue(objQueue, arrInput[i]);
		}
		String[] data=new String[objQueue.getSize()];
		for(int i=0;i<arrInput.length;i++){
			data[i]=objUtility.dequeue(objQueue);
		}
		for(int i=0;i<objQueue.getSize();i++){
			if(arrInput[i].equals(data[i])){
				isPallindrome=true;
				break;
			}
		}
		System.out.println(isPallindrome);
	}
}
