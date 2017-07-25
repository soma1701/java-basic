package com.soma.logical;

import java.util.Random;
import java.util.Scanner;

public class CrossGame {
	public static void main(String[] args) {
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		String system="X";
		String User="O";
		String[][] s=new String[3][3];
		System.out.println("Press 1 for system turn:-");
		System.out.println("Press 2 for user turn:-");
		for(int i=0;i<8;i++){
		
		System.out.println("Enter ur choice:-");
		int choice=sc.nextInt();
		int row=0,col=0;
	        switch(choice){
			case 1:
				
				playSystem(row,col,s);
			break;
			case 2:
				playUser(row,col,s);
			break;
			default:
				System.out.println("wrong choice");
		}
	}
	}
	private static void playUser(int row,int col,String[][] s) {
    String user="O";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter row:");
    row=sc.nextInt();
    System.out.println("Enter col:");
    col=sc.nextInt();
    try{
    	if(s[row][col]==null){
    
    	s[row][col]=user;
    	printArr(s);
    	}
    }catch(Exception e){
    	e.getMessage();
    }
    
	}
    	public static void playSystem(int row,int col,String[][] s){
		Random r=new Random();
		String system="X";
		row=r.nextInt(3);
		col=r.nextInt(3);
		if(s[row][col]==null){
		s[row][col]=system;
		printArr(s);
		
		
	}
	}
	
	public static void initialiseArr(String[][] s){
		for(int row=0;row<3;row++){
			for(int col=0;col<3;col++){
				s[row][col]="";
			}
			System.out.println();
		}
	}
	
	public static void printArr(String[][] s){
		for(int row=0;row<3;row++){
			for(int col=0;col<3;col++){
				System.out.print(s[row][col]);
				System.out.print("_________");
				System.out.print("|");
				
			}
			System.out.println();
		}
	}
}