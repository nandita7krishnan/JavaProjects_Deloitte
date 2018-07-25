package com.deloitte.main;

public class Bird extends Animal implements Flyer {

	@Override
	public void takeOFF() {
		System.out.println("Takinf Off");

	}

	@Override
	public void land() {
		System.out.println("Landing");

	}

	@Override
	public void fly() {
		System.out.println("Flying");

	}
	
	public void buildNest() {
		System.out.println("building nest");
	}
	
	public void layEggs() {
		System.out.println("laying eggs");
	}
}
