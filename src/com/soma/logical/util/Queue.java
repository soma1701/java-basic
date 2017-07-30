package com.soma.logical.util;

public class Queue {
	private String[] arrOueue;
	private  int front=-1;
	private int rare=-1;
	private int size;
	public Queue(int size){
		this.size=size;
		arrOueue=new String[this.size];
	}
	public String[] getArrOueue() {
		return arrOueue;
	}
	public void setArrOueue(String[] arrOueue) {
		this.arrOueue = arrOueue;
	}
	public int getFront() {
		return front;
	}
	public void setFront(int front) {
		this.front = front;
	}
	public int getRare() {
		return rare;
	}
	public void setRare(int rare) {
		this.rare = rare;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	

}
