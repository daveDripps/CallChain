package com.belfastcodeforge.callchain.nodes;

public interface Node<T> {
	
	
	public <T> Node next();
	public <T> Node next(T node);
	public void node(T commandToExcute, T commandToRevert);
	public void node(T commandToExcute);

}
