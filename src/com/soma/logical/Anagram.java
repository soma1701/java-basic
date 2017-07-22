package com.soma.logical;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first String:-");
    String s=sc.nextLine();
    System.out.println("Enter second String:-");
    String s1=sc.nextLine();
    checkAnagram(s,s1);
	}

	public static void checkAnagram(String s, String s1) {
		int count=0;
		if(s.length()==s1.length()){
			for(int i=0;i<s.length();i++){
				for(int j=0;j<s1.length();j++){
					if(s.charAt(i)==s1.charAt(j)){
						count++;
					
					}
				}
			}
			if(count==s.length()){
				System.out.println("anagram");
			}else
				System.out.println("not anagram");
 		 }
		 
	}
	

}
