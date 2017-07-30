package com.soma.logical.main;

import java.util.Scanner;

public class StackImpl {
	Scanner sc=new Scanner(System.in);
	static int top=-1;
     char element;
	 int stacksize;
	 char[] stackArr;


   public	StackImpl(int stacksize){
	 this.stacksize=stacksize;
	 this.stackArr=new char[getStacksize()];
  }

   
	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public char getElement() {
		return element;
	}

	public void setElement(char element) {
		this.element = element;
	}

	public int getStacksize() {
		return this.stacksize;
	}

	public void setStacksize(int stacksize) {
		this.stacksize = stacksize;
	}

	public char[] getStackArr() {
		return this.stackArr;
	}

	public void setStackArr(char[] stackArr) {
		this.stackArr = stackArr;
	}
	public boolean isStackFull(){
		return top>stacksize;
		
	}
	public boolean isstackEmpty(){
		return top<0;
		
	}

	public void insert(char element){
		if(isStackFull()){
		
			System.out.println("unable to insert");
		}else{
			this.top++;
			System.out.print(this.stackArr[this.top]=element);
		    }
	}
	public void delete(){
		if(isstackEmpty()){
			System.out.println("unable to delete");
		}else{
			  this.stackArr[top]=0;
			  this.top--;
		 }
	}
	public void show(){
		for(int i=0;i<stackArr.length;i++){
			System.out.print(stackArr[i]);
		}
	}



	/*public static void main(String args[]){
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
	                char del=(char) sc.nextInt();
	                stack.delete(del);
	                break;
	                default:
	                	System.out.println("you have entered wrong choice:-");
	    }
	    }
}*/
}
	

