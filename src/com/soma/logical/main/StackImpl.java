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

}
