package com.deloitte.main;

public class Airport {

	public static void main(String[] args) {
		Airport metropolisAirport = new Airport();
		Helicopter copter =new Helicopter();
		SeaPlane splane=new SeaPlane();
		
		metropolisAirport.givePermissionToLand(copter);
		metropolisAirport.givePermissionToLand(splane);
		
	}
	public void givePermissionToLand(Flyer f) {
		f.land();
	}

}
