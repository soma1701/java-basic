package com.soma.logical;

import java.util.Scanner;

public class TwoDArr {
	public static void main(String[] a){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no of rows:-");
		int row=sc.nextInt();
		System.out.println("Enter no of cols:-");
		int column=sc.nextInt();
		System.out.println("Enter your choice");
		int choice;
		choice=sc.nextInt();
		switch(choice){
			case 1:
				insertInteger(row,column,sc);
				break;
			case 2:
				insertDouble();
				break;
			case 3:
				insertBoolean();
				break;
			default:
				System.err.println("You have given wrong input");
		}
	}

	public static void insertInteger(int row, int column, Scanner sc) {
		int[][] b=new int[row][column];
		boolean isExceptionOccured = false;
		do{
			try{
				System.out.println("Enter elements:-"+(row*column));
		        for(int i=0;i<row;i++)
		        {
		        	for(int j=0;j<column;j++){
		        		b[i][j]=sc.nextInt();
		        	}
		        }
		        isExceptionOccured = false;
			}catch(Exception e){
//				e.printStackTrace();
				isExceptionOccured = true;
				System.out.println("Please enter integer value only");
			}
		}while(isExceptionOccured);
		System.out.println("Print two d arr:");
        for(int i=0;i<row;i++){
        	for(int j=0;j<column;j++){
        		System.out.print(b[i][j]+" ");
        	}
        	   System.out.println();
        }
	}
}
