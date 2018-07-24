package com.deloitte.main;

class Points{
	int x, y;
	
 }
public class MainClass {

	
	public static void main(String[] args) {
	Points[] point;
	point=new Points[3];
	
	point[0]=new Points();
	point[1]=new Points();
	point[2]=new Points();

	point[0].x=2;
	point[1].x=11;
	point[2].x=4;

	for(Points p:point)
		System.out.println(p.x+ " " +p.y);
	}

}
