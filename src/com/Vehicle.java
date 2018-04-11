package com;


public class Vehicle {

    Owner ownerObj;
    String vehicleNo;
    String vehicleType;
    int slotNo;
//    int parkingDuration;
    
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
