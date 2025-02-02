/*You will have to complete the vehicleNode Contrustor first
 then implement the hashFunction() and insertVehicle() methods
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
class VehicleHashTable{

	//vehicleTable[] :: is the HashTable array that stores the VehicleNodes
	VehicleNode[] vehicleTable;
	
	//Constructor that initializes the HashTable array
	//DO NOT change this Constructor
	public VehicleHashTable(int size){
		this.vehicleTable = new VehicleNode[ size ];
	}

	//This method called to insert each vehicle info form the 2D Array of Vehicles
	//DO NOT change this method
	public void createFromVehicleInfoArray( Object[][] arr ){
		for( Object[] x: arr )
			this.insertVehicle(x);
	}

	//This method basically prints the HashTable
	//DO NOT change this method
	public void printVehicleHashtable(){
		for( int i=0; i<vehicleTable.length; i++ ){
			System.out.print(i+" : ");
			VehicleNode n = vehicleTable[i];
			if (n==null) System.out.println("null");
			while ( n!=null ){
				System.out.print( 
				"(Brand: "+n.brand+
				", Type: "+n.vehicleType+
				", Rent: "+n.rent+
				", Passengers: "+n.passengers+") --> " );
				if (n.next==null) System.out.println("null");
				n=n.next;
			}
		}
	}

	//This method finds the empty slot from the usedSlot Boolean Array
	//DO NOT change this method
	public int findEmptySlot(){
		for(int i=0; i<this.vehicleTable.length; i++){
			if ( vehicleTable[i]==null )
				return i;
		}
		System.out.println("No free slots");
		return -1;
	}

	//you need to COMPLETE this method
	private Integer hashFunction(String brand){
		int a =0;
		for(int i = 0;i< brand.length();i++){
			a += (int) brand.charAt(i); 
		}
		
		return a% vehicleTable.length;
	}

	//you need to COMPLETE this method
	//Write this method after writing hashFunction method since you'll need to use it below
	public void insertVehicle( Object[] vehicleInfo ){
		String brand = (String) vehicleInfo[0];
        String vehicleType = (String) vehicleInfo[1];
        Integer rent = (Integer) vehicleInfo[2];
        Integer passengers = (Integer) vehicleInfo[3];

    	int index = hashFunction(brand);
        VehicleNode newNode = new VehicleNode(brand, vehicleType, rent, passengers);

        if (vehicleTable[index] == null) {
            vehicleTable[index] = newNode;
        } 
		else {
			VehicleNode curr = vehicleTable[index];
            if(curr.brand.equals(brand)){
				newNode.next = curr;
				vehicleTable[index] = newNode;
				
			}
			else{
				int indx = findEmptySlot();
				if(indx != -1){
					vehicleTable[indx] = newNode;
				}
			}
			
        }

	}
	
}
