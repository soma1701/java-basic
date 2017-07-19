package com.soma.logical;

import java.util.Scanner;

public class TwoDArr {
	public static void main(String[] a){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no of rows:-");
		int r=sc.nextInt();
		System.out.println("Enter no of cols:-");
		int c=sc.nextInt();
		int[][] b=new int[r][c];
		System.out.println("Enter elements:-"+(r*c));
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++){
        		b[i][j]=sc.nextInt();
        		
        	}
        }
        System.out.println("Print two d arr:");
        for(int i=0;i<r;i++){
        	for(int j=0;j<c;j++){
        		System.out.print(b[i][j]+" ");
        	}
        	   System.out.println();
        }
     
		
		
		
		
	}

}
