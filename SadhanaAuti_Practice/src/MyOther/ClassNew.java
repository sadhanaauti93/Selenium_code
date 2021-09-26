package MyOther;

import MyIfesle.Flight;

public class ClassNew {

	public static void main(String[] args) {
		Flight.resetAllPassengers();
		Flight laxToSlc = new Flight();
		
		laxToSlc.add1Passenger();
		//laxToSlc.add2Passenger();
		
		Flight XYZ = new Flight();
		XYZ.add1Passenger();
		
		System.out.println(laxToSlc.getPassengers());
		System.out.println(XYZ.getPassengers());

		System.out.println(Flight.getPassengers());
	}
}
