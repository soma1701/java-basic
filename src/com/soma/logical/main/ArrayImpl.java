package com.soma.logical.main;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import com.soma.logical.util.Utility;

public class ArrayImpl {
	public static void main(String[] args) throws FileNotFoundException{
		Utility u=new Utility();
		OutputStream outputstream = new FileOutputStream("src/resource/test.txt");
		OutputStreamWriter outputstreamwriter=new OutputStreamWriter(outputstream);
		PrintWriter printwriter=new PrintWriter(outputstreamwriter);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows:-");
		int row=sc.nextInt();
		System.out.println("Enter no of colums:-");
		int col=sc.nextInt();
		int[][] i=new int[row][col];
		double[][] d=new double[row][col];
		boolean[][] b=new boolean[row][col];
		System.out.println("Press 1 for Integer Array");
		System.out.println("Press 2 for Double Array");
		System.out.println("Press 3 for Boolean Array");
		System.out.println("Enter your choice:-");
		int choice=sc.nextInt();
		switch(choice){
		case 1: 
			u.readIntegerArray(row, col, sc);
			u.printIntArrayOnFile(i, row, col, printwriter);
			break;
		case 2:
			u.readDoubleArray(row, col, sc);
			u.printDoubleArrayOnFile(d, row, col, printwriter);
			break;
		case 3:
			u.readBooleanArray(row, col, sc);
			u.printBooleanArrayOnFile(b, row, col, printwriter);
			break;
			default:
				System.out.println("wrong choice:-");
		
		}
		
	}

	
		
			
}

 
