package com.deloitte;

import java.lang.System;
public class MainClass {

		public static void main(String[] args) {
		int[] a,b;
		a= new int[] {1,2,3,4,5};
		b=new int[10];
		for(int i=0;i<5;i++) {
			System.arraycopy(a, 0, b, 0, 5);
		}
		for( int j:b) {
			
		System.out.println(j+"\t");
		}
	}
}


