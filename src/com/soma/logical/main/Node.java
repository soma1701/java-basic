package com.soma.logical.main;

public class Node {
	private static int data;
	private static Node next;
	public  int getData()
	{
		return data;
	}
	public  void setData( int data)
	{
		this.data=data;
	}
	public Node getNext(){
		return next;
	}
	public void setNext(Node next){
		this.next=next;
	}
	
	

}
