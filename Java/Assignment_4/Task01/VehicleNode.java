class VehicleNode{

	String brand;
	String vehicleType; 
	Integer rent;
	Integer passengers;
	VehicleNode next;
		
	public VehicleNode(String brand, String vehicleType, Integer rent, Integer passengers){
		this.brand = brand;
		this.vehicleType = vehicleType;
		this.rent = rent;
		this.passengers = passengers;
		this.next = null;
	}

}
