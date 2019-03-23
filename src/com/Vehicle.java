package com;


public class Vehicle {

   
	Owner ownerObj;
    String vehicleNo;
    String vehicleType;
    int slotNo;
//    int parkingDuration;
    
    public Vehicle() {
    }
    
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ownerObj == null) ? 0 : ownerObj.hashCode());
		result = prime * result + slotNo;
		result = prime * result + ((vehicleNo == null) ? 0 : vehicleNo.hashCode());
		result = prime * result + ((vehicleType == null) ? 0 : vehicleType.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (ownerObj == null) {
			if (other.ownerObj != null)
				return false;
		} else if (!ownerObj.equals(other.ownerObj))
			return false;
		if (slotNo != other.slotNo)
			return false;
		if (vehicleNo == null) {
			if (other.vehicleNo != null)
				return false;
		} else if (!vehicleNo.equals(other.vehicleNo))
			return false;
		if (vehicleType == null) {
			if (other.vehicleType != null)
				return false;
		} else if (!vehicleType.equals(other.vehicleType))
			return false;
		return true;
	}


	public Vehicle(String vehicleNo, String vehicleType, int slotNo) {
		super();
		this.vehicleNo = vehicleNo;
		this.vehicleType = vehicleType;
		this.slotNo = slotNo;
	}

    
    public Owner getOwnerObj(){
        return ownerObj;
    }
    
    public void setOwnerObj(Owner o){
        this.ownerObj=o;        
    }
    
    public String getVehicleNo(){
        return vehicleNo;
    }
    
    public void setVehicleNo(String vNo){
        this.vehicleNo=vNo;
    }
    
    public int getSlotNo(){
        return slotNo;
    }
    
    public void setSlotNo(int sNo){
        this.slotNo=sNo;
    }
    
    public String getVehicleType(){
        return vehicleType;
    }
    
    public void setVehicleType(String vt){
        this.vehicleType=vt;
    }
    
//    public int getParkingDuration(){
//        return parkingDuration;
//    }
//    
//    public void setParkingDuration(int pd){
//        this.parkingDuration=pd;
//    }
        
}
