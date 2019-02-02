package com;

import java.util.ArrayList;


public class logic {

	ArrayList<Vehicle> twowheeler=new ArrayList<Vehicle>();
	ArrayList<Vehicle> car=new ArrayList<Vehicle>();
	ArrayList<Vehicle> truck=new ArrayList<Vehicle>();
	int index=0, tindex=0, trindex=0; //count of arraylist....
	public void addVehicle(String vNo, String vType, int slot) throws InvalidVehicleException, InvalidSlotException {
		Vehicle v=new Vehicle();//object creation...
		
		if(vType.equalsIgnoreCase("twowheeler")) {
			v.setVehicleType(vType.toLowerCase());
		
					v.setVehicleNo(vNo);
		
		
		if(slot<=40 && slot>0) {//to ensure that the slot is in between 1-40
			if(twowheeler.isEmpty()) {//if the arraylist is empty
				v.setSlotNo(slot);
			}else {//if not empty
				for(int i=0; i<twowheeler.size(); i++) {
					if(vType.equalsIgnoreCase(twowheeler.get(i).getVehicleType()) && slot!=twowheeler.get(i).getSlotNo()){//confirms the vehicle type and slot no. of same index
                        v.setSlotNo(slot);
                    }else if(!vType.equals(twowheeler.get(i).getVehicleType())){
                        v.setSlotNo(slot);
                    }else {
                    	throw new InvalidSlotException("Slot already alloted");
                    }
				}
			}
			
		}else {
			throw new InvalidSlotException("check Slot No");
		}
		
		twowheeler.add(v);//setting arraylist object...
		tindex++;//increase count
		System.out.println(v.vehicleNo+"added");
		}
		
		if(vType.equalsIgnoreCase("car")) {
			v.setVehicleType(vType.toLowerCase());
		
		
			v.setVehicleNo(vNo);
		
		if(slot<=40 && slot>0) {
			if(car.isEmpty()) {
				v.setSlotNo(slot);
			}else {
				for(int i=0; i<car.size(); i++) {
					if(vType.equals(car.get(i).getVehicleType()) && slot!=car.get(i).getSlotNo()){//confirms the vehicle type and slot no. of same index
                        v.setSlotNo(slot);
                    }else if(!vType.equals(twowheeler.get(i).getVehicleType())){
                        v.setSlotNo(slot);
                    }else {
                    	throw new InvalidSlotException("Slot already alloted");
                    }
				}
			}
		}else {
        	throw new InvalidSlotException("check slot no");
        }
		car.add(v);//setting arraylist object...
		index++;
		System.out.println(v.getVehicleNo()+"added");
		}
		
		if(vType.equalsIgnoreCase("truck")) {
			v.setVehicleType(vType.toLowerCase());
		
		
			v.setVehicleNo(vNo);
		
		if(slot<=40 && slot>0) {
			if(truck.isEmpty()) {
				v.setSlotNo(slot);
			}else {
				for(int i=0; i<truck.size(); i++) {
					if(vType.equals(truck.get(i).getVehicleType()) && slot!=truck.get(i).getSlotNo()){//confirms the vehicle type and slot no. of same index
                        v.setSlotNo(slot);
                    }else if(!vType.equals(truck.get(i).getVehicleType())){
                        v.setSlotNo(slot);
                    }else {
                    	throw new InvalidSlotException("Slot already alloted");
                    }
				}
			}
		}else {
        	throw new InvalidSlotException("check slot no");
        }
		truck.add(v);//setting arraylist object...
		trindex++;
		System.out.println(v.getVehicleNo()+"added");
		}
	}
	
	public void deleteVehicle(String vNO) throws InvalidVehicleException {
		for(int i=0; i<twowheeler.size(); i++) {
			 if(vNO.equals(twowheeler.get(i).getVehicleNo())) {
				 twowheeler.remove(i);
				 tindex--;
			 }
		 }
	      
		 for(int i=0; i<car.size(); i++) {
			 if(vNO.equals(car.get(i).getVehicleNo())) {
				 car.remove(i);
				 index--;
			 }
		 }
		 
		 for(int i=0; i<truck.size(); i++) {
			 if(vNO.equals(truck.get(i).getVehicleNo())) {
				 truck.remove(i);
				 trindex--;
			 }
		 }
			
			
		}
	
	
}
	
