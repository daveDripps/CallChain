package com.belfastcodeforge.chains;

public interface Chain<T> {
	public void add(T action, T revert);
	public void add(T action);
	public T execute();
}
