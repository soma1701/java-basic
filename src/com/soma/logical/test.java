package com.soma.logical;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class test {
	

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		OutputStream outputstream = null;
		OutputStreamWriter outputstreamwriter=new OutputStreamWriter(outputstream);
		PrintWriter pw=new PrintWriter(outputstreamwriter);
		double[][] b=new double[2][3];
		for(int i=-0;i<2;i++){
			for(int j=0;j<3;j++){
				b[i][j]=sc.nextDouble();
			}
		}
		
		pw.println(b);
	}
 
}
