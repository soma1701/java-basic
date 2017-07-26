package com.soma.logical.main;

import java.util.Scanner;

public class StackImpl {
	Scanner sc=new Scanner(System.in);
	 int top=0;
	static int element;
	int stacksize;
	int stackArr[] = null;
    public	StackImpl(int stacksize){
	 this.stacksize=stacksize;
	 this.stackArr=new int[getStacksize()];
   }
    
	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public int getStacksize() {
		return this.stacksize;
	}

	public void setStacksize(int stacksize) {
		this.stacksize = stacksize;
	}

	public int[] getStackArr() {
		return this.stackArr;
	}

	public void setStackArr(int[] stackArr) {
		this.stackArr = stackArr;
	}
	public boolean isStackFull(){
		return top>stacksize;
		
	}
	public boolean isstackEmpty(){
		return top<0;
		
	}
	public void insert(int element){
		if(isStackFull()){
		
			System.out.println("unable to insert");
		}
		else{
			
			System.out.println("Enter the element into stack");
		    for(int i=0;i<getStacksize()-1;i++){
		    	
		    	 element=sc.nextInt();
			System.out.println(this.stackArr[this.top]=element);
			
			
		    this.top++;
		    }
		    }
		}
	public void delete(int element){
		if(isstackEmpty()){
			System.out.println("unable to delete");}
		else
			{
			top--;
			stackArr[top]=0;
			System.out.println("after deleting element");
			int temp=top;
			for(int i=0;i<top;i++){
				temp=temp-1;
			int b=stackArr[temp];
			System.out.println(b);}
			}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int stacksize=sc.nextInt();
		StackImpl stack= new StackImpl(stacksize);
		System.out.println("Press 1 for insertion:-");
		System.out.println("Press 2 for deletion:-");
		System.out.println("Enter your choice:-");
		int choice=sc.nextInt();
	    while(true){
	    	switch(choice){
	    	case 1:
	                for(int i=0;i<stacksize-1;i++){
	                stack.insert(element);}
	                break;
	    	case 2:
	    		    System.out.println("Enter the element you want to delete");
	                int del=sc.nextInt();
	                stack.delete(del);
	                break;
	                default:
	                	System.out.println("you have entered wrong choice:-");
	    }
	    }
}
}
	
