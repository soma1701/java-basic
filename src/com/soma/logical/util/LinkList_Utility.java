package com.soma.logical.util;

import com.soma.logical.main.linklist.LinkList;
import com.soma.logical.main.linklist.Node;

public class LinkList_Utility {
	public boolean isEmpty(){
		 		 return LinkList.getStart()==null;
		 	}
		 	public void insertAtStart(String data)
		 	{
		 		Node node =new Node();
		 		node.setData(data);
		 		LinkList.setSize(LinkList.getSize()+1);
		 		if(LinkList.getStart()==null)
		 		{
		 			LinkList.setStart(node);
		 			LinkList.setEnd(LinkList.getStart());
		 		}else{
		              node.setNext(LinkList.getStart());
		              LinkList.setStart(node);
		 		}
		 	}
		 	public void insertAtEnd(String data){
		 		
		 		Node node=new Node();
		 		node.setData(data);
		 		if(LinkList.getEnd()==null)
		 		{
		 			LinkList.setEnd(node);
		 			LinkList.setStart(node);
		 		}else{
		 			LinkList.getEnd().setNext(node);
		 			LinkList.setEnd(node);
		 		}
		 		LinkList.setSize(LinkList.getSize()+1);
		 	}
        
		 	public void insertAtPosition(String data,int position){
		 		LinkList.setSize(LinkList.getSize()+1);
		 		Node node=new Node();
		 		node.setData(data);
		 		if(position==1){
		 			insertAtStart(data);
		 		}
		 		else if(position==LinkList.getSize()+1){
		 			insertAtEnd(data);
		 		}
		 		else if(position<=LinkList.getSize()){
		 			Node ptr=LinkList.getStart();
		 			for(int i=1;i<position;i++){
		 					ptr=ptr.getNext();
		 					if(i==position-1){
		 						node.setNext(ptr.getNext());
		 						ptr.setNext(node);
		 					}
		 			}
		 			
		 		}else{
		 			System.out.println("Unable to insert data:");
		 			
		 		}
		 		
		 	}
		 	public void removeFromPosition(int position){
		 		Node ptr=LinkList.getStart();
		 		if(position==1)
		 		{
		 		LinkList.setStart(LinkList.getStart().getNext());
		 		}
		 		else if(position<=LinkList.getSize()){
		 			for(int i=1;i<position;i++)
		 			{
		 				Node prt=LinkList.getStart();
		 				ptr=ptr.getNext();
		 				if(i==position-1){
		 					LinkList.setSize(LinkList.getSize()-1);
		 					if(position==LinkList.getSize())
		 					{
		 						ptr.setNext(null);
		 					}
		 					else
		 					{
		 						ptr.setNext(ptr.getNext().getNext());
		 				    }
		 				}
		 			}
		 		}
		 	}
		 	public void show(){
		 		int i=0;
		 		Node ptr=LinkList.getStart();
		 		while(ptr!=null){
		 			i++;
		 			if(LinkList.getSize()==1){
		 				System.out.println(ptr.getData());
		 			}
		 			else {
		 				{
		 					System.out.println(ptr.getData());
		 					ptr=ptr.getNext();
		 				}
		 			}
		 		}
		 	}
		 	public int search(String search){
		 		int i=0;
		 		Node ptr=LinkList.getStart();
		 		while(ptr!=null){

		 			i++;

		 			if(ptr.getData().equals(search)){

		 				return i;
		 			}
		 			ptr=ptr.getNext();
		 		}
		 		return -1;

		 	}
		 	//method for sorted link list which will return index to insert data
		 	public int fetchPosition(int data){
		 		int position=0;
		 		Node ptr=LinkList.getStart();
		 		for(int i=0;i<LinkList.getSize();i++,position++){
		 			if(data < Integer.parseInt(ptr.getData())){
		 				return position;
		 			}else{
		 				ptr = ptr.getNext();
		 			}
		 		}
		 		return position;
		 	}
	
}


