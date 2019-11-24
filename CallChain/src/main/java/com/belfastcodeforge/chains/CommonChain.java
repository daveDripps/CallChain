package com.belfastcodeforge.chains;

import com.belfastcodeforge.callchain.nodes.Node;

public abstract class CommonChain {
	
	Node head;
	
	
	protected void appendNode(Node node) {

		    /* 1. Allocate the Node & 
		       2. Put in the data 
		       3. Set next as null */
		    Node new_node = node; 
		  
		    /* 4. If the Linked List is empty, then make the 
		           new node as head */
		    if (head == null) 
		    { 
		        head = node; 
		        return; 
		    } 
		  
		    /* 4. This new node is going to be the last node, so 
		         make next of it as null */
		    new_node.next(null); 
		  
		    /* 5. Else traverse till the last node */
		    Node last = head;  
		    while (last.next() != null) 
		        last = last.next(); 
		  
		    /* 6. Change the next of last node */
		    last.next(new_node);// = new_node; 
		    return; 
		
		
	}

}
