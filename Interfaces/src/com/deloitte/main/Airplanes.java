package com.deloitte.main;

public class Airplanes extends Vehicle implements Flyer {

	@Override
	public void takeOFF() {
		System.out.println("Takinf Off");
	}

	@Override
	public void land() {
		System.out.println("Airplanes Landing");

	}

	@Override
	public void fly() {
		System.out.println("Flying");
	}

}
