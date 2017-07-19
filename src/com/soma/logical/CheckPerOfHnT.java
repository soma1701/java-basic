package com.soma.logical;

import java.util.Scanner;

public class CheckPerOfHnT {
	public static void main(String a[]) {
		System.out.println("Print number of times to flip coin:-");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int h = 0;
		int t = 0;
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				if (Math.random() > 0.5) {
					h++;
				} else {
					t++;
				}
			}
			System.out.println("precentage of head" + (h * 100) / n);
			System.out.println("precentage of head" + (t * 100) / n);
		}
	}
}
