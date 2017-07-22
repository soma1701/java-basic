package com.soma.logical;

import java.util.Date;

public class StopWatch {
	static Date date=new Date();
    static long startTime=0;
    static long endTime=0;
    long elapsedTime=0;
	public static long startTime() {
		long startTime= date.getTime();
		return startTime;
		}
	public static long endTime(){
		long endTime=System.currentTimeMillis();
		return endTime;
	}
	public static void elapsedTime(){
		long elapsedTime=startTime-endTime;
		System.out.println(elapsedTime);
	}
	public static void main(String[] a){
		StopWatch.elapsedTime();
		
	}

}
