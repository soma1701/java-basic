package com.soma.logical.main;

public class LinkListImpl { 
	public boolean isEmpty(){
		 return LinkList.getStart()==null;
	}
	public void insertAtStart(int data)
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
	public void insertAtEnd(int data){
		LinkList.setSize(LinkList.getSize()+1);
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
	}
	public void insertAtPosition(int data,int position){
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
		Node ptr=LinkList.getStart();
		if(LinkList.getSize()==1){
			System.out.println(ptr.getData());
		}
		else {
			for(int i=1;i<LinkList.getSize();i++){
				System.out.println(ptr.getData());
				ptr=ptr.getNext();
			}
			
		}
		}
	
}


