package com.soma.logical.main;

import java.util.Arrays;
import java.util.Scanner;

import com.soma.logical.util.Utility;

public class Insertion {
	public static void main(String[] args) {
		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:-");
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		u.insertionSort(s1);
		}
		
  }


	

