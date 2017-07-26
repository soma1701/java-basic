package com.soma.logical.main;

import java.util.Scanner;

public class UserInteraction{
	public static void main(String[]a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter datastructuretype press S for Signular linklist and y for doubly linklist:-");
		char datastructuretype=sc.next().charAt(0);
		if(datastructuretype=='S'||datastructuretype=='s'){
			while(true){

                        LinkListImpl linklistimpl=new LinkListImpl();
                        int data=0,position=0;
                        System.out.println("Press 1 for epmty check:");
                        System.out.println("Press 2 insert at start:");
                        System.out.println("Press 3 for insert at end:");
                        System.out.println("Press 4 for insert at position:");
                        System.out.println("Press 5 for getting size of linklist:");
                        System.out.println("Press 6 for remove from position:");
                        System.out.println("Press 7 for show data in linklist:");
                        System.out.println("Enter your choice");
                        int choice=sc.nextInt();
                        switch(choice){
                        case 1:
                        	if(linklistimpl.isEmpty()){
                        		System.out.println("LinkList is empty:");
                        	}
                        	else{
                        		System.out.println("LinkList is not empty:");
                        	}
                        	break;
                        case 2:
                          System.out.println("Enter data:");
                          data=sc.nextInt();
                          linklistimpl.insertAtStart(data);
                          break;
                        case 3:
                        	System.out.println("Enter data:");
                            data=sc.nextInt();
                            linklistimpl.insertAtEnd(data);
                            break;
                        case 4:
                        	System.out.println("Enter data:");
                            data=sc.nextInt();
                            linklistimpl.insertAtPosition(data,position);
                            break;
                        case 5:
                        	System.out.println("for getting size of linklist is:-"+LinkList.getSize());
                        	break;
                        case 6:
                        	System.out.println("Enter the posiotion:");
                        	linklistimpl.removeFromPosition(position);
                        	break;
                        case 7:
                        linklistimpl.show();
                        	break;
                     default:
                    	 System.out.println("srong choice:");
                    	 break;
                    	 
                    	 
                        	
                        	
           
				
			}
		}
			
	}

}

	
}
