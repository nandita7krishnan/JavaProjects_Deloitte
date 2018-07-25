package com.deloitte.main;

public class Harbor {

	public static void main(String[] args) {
		Harbor bostonHarbor=new Harbor();
		RiverBarge barge =new RiverBarge();
		SeaPlane sPlane=new SeaPlane();
		
		bostonHarbor.givePermissionToDock(barge);
		bostonHarbor.givePermissionToDock(sPlane);
		
	}
	public void givePermissionToDock(Sailer s) {
		s.dock();
		
	}

}
