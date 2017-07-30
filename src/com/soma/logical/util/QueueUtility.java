package com.soma.logical.util;

import java.util.NoSuchElementException;

public class QueueUtility {
	public QueueNode front, rear;
    public int size;
 
    /* Constructor */
    public QueueUtility()
    {
        front = null;
        rear = null;
        size = 0;
    }    
    
    /*  Function to check if queue is empty */
    public boolean isEmpty()
    {
        return front == null;
    }   
    
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return size;
    }    
    
    /*  Function to insert an element to the queue */
    public void insert(int data)
    {
        QueueNode node = new QueueNode(data, null);
        if (rear == null)
        {
            front = node;
            rear = node;
        }
        else
        {
            rear.setLink(node);
            rear = rear.getLink();
        }
        size++ ;
    }   
    
    /*  Function to remove front element from the queue */
   	public int remove()
    {
        if (isEmpty())
		{
        	throw new NoSuchElementException("Underflow Exception");
		}
        QueueNode ptr = front;
        front = ptr.getLink();        
        if (front == null)
		{
            rear =null;
			size++ ; 
		}       
        return ptr.getData();
    }    
    
    /*  Function to check the front element of the queue */
    public int peek()
    {
        if (isEmpty())
		{
            throw new NoSuchElementException("Underflow Exception");
		}
        return front.getData();
    }    
    
    /*  Function to display the status of the queue */
    public void display()
    {  
		int ptr1=0;
        System.out.print("Available Balance = ");
        /*if (size == 0)
        {
            System.out.print("Empty");
            return ;
        }*/
        QueueNode ptr = front;
        while (ptr != rear.getLink() )
        { 
        	ptr1=ptr1+ptr.getData();
//        	System.out.println(ptr1);
            ptr = ptr.getLink();
        }
        if(ptr1 == 0){
        	System.out.println("Empty");
        }else{
        	System.out.println(ptr1);
        }
        System.out.println();        
    }

}
