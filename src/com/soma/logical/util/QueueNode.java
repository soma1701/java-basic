package com.soma.logical.util;

public class QueueNode {
	protected int data;
    protected QueueNode link;
 
    /*  Constructor  */
    public QueueNode()
    {
        link = null;
        data = 0;
    }  
    
    /* Parameterized Constructor  */
    public QueueNode(int d,QueueNode n)
    {
        data = d;
        link = n;
    }  
    
    /*  Function to set data to current Node  */
   	public void setData(int d)
    {
        data = d;
    }   
    
   	/*  Function to get link to next node  */
   	public QueueNode getLink()
    {
     	return link;
    }  
    
	/*  Function to set link to next Node  */
    public void setLink(QueueNode n)
    {
        link = n;
    }  

    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }

}
