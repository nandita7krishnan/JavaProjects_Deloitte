package com.deloitte.scope;

class ScopeExample{
	private int i=1;
	public void firstMethod() {
		int i=4,j=5;
		this.i=i+j;
		secondMethod(7);
	}
	public void secondMethod(int i) {
		int j=8;
		this.i=i+j;
	}
}
public class MainClass {
	public MainClass() {
		ScopeExample scope=n ew ScopeExample();
		scope.firstMethod();
	}
}
