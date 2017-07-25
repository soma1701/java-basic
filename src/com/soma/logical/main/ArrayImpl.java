package com.soma.logical;

//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArrayImpl {
	public static void main(String[] args) throws FileNotFoundException{
		OutputStream outputstream = new FileOutputStream("src/com/soma/logical/test.txt");
		OutputStreamWriter outputstreamwriter=new OutputStreamWriter(outputstream);
		PrintWriter printwriter=new PrintWriter(outputstreamwriter);
		Scanner sc=new Scanner(System.in);
//		PrintWriter writer = new PrintWriter(new OutputStreamWriter(, "UTF-8"));
		System.out.println("Enter no of rows:-");
		int row=sc.nextInt();
		System.out.println("Enter no of colums:-");
		int col=sc.nextInt();
		System.out.println("Press 1 for Integer Array");
		System.out.println("Press 2 for Double Array");
		System.out.println("Press 3 for Boolean Array");
		System.out.println("Enter your choice:-");
		int choice=sc.nextInt();
		switch(choice){
		case 1: 
			insertInteger(row,col,sc,printwriter);
			break;
		case 2:
			insertDouble(row,col,sc,printwriter);
			break;
		case 3:
			insertBoolean(row,col,sc,printwriter);
			break;
			default:
				System.out.println("wrong choice:-");
		
		}
		/*insertInteger(row,col,sc);	
		//printArray(row,col);
		insertDouble(row,col,sc);	
		insertBoolean(row,col,sc);*/
	}

	public static void insertInteger(int row, int col, Scanner sc, PrintWriter printwriter) {
		int[][] b=new int[row][col];
		System.out.println("enter"+row*col+"elements");
		try{
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				b[i][j]=sc.nextInt();
			}
		}
		}catch(Exception e){
		System.out.println("Enter integer no only");
		}
		System.out.println("print array:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
			printwriter.print(b[i][j]);
//				System.out.print(b[i][j]);
			}
//			System.out.println();
		    printwriter.println();
		}
		printwriter.flush();
		printwriter.close();
	   }
		public static void insertDouble(int row, int col, Scanner sc, PrintWriter printwriter) {
			double[][] b=new double[row][col];
			System.out.println("enter"+row*col+"elements");
			try{
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					b[i][j]=sc.nextDouble();
				}
			}
			}catch(Exception e){
				System.out.println("Enter integer no only");
			}
			System.out.println("print array:");
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					printwriter.print(b[i][j]);
//					System.out.print(b[i][j]);
				}
//				System.out.println();
			    printwriter.println();
			}
			printwriter.flush();
			printwriter.close();
			}
			public static void insertBoolean(int row, int col, Scanner sc, PrintWriter printwriter) {
             boolean[][] b=new boolean[row][col];
				System.out.println("enter"+row*col+"elements");
				try{
				for(int i=0;i<row;i++){
					for(int j=0;j<col;j++){
						b[i][j]=sc.nextBoolean();
					}
				}
				}catch(Exception e){
					System.out.println("Enter integer no only");
				}
				System.out.println("print array:");
				for(int i=0;i<row;i++){
					for(int j=0;j<col;j++){
						printwriter.print(b[i][j]);
						//System.out.print(b[i][j]);
					}
//					System.out.println();
				    printwriter.println();
				}
				printwriter.flush();
				printwriter.close();
				}
}

 
