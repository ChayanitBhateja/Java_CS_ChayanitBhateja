package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class ParkingManagement implements VehicleParking{
    static int count=0;
    ArrayList<Vehicle> gaddi= new ArrayList<>();    
        
     Scanner s=new Scanner(System.in); 
    @Override
    public boolean addVehicleTOSlot(Vehicle v)throws InvalidSlotException, SlotNotFoundException{               
        Owner o = new Owner();
        
        
//        System.out.println("Owner Name: ");
//        String oName=s.next();
//        o.setOwnerName(oName);
//        v.setOwnerObj(o);
        
        System.out.println("Vehicle No: ");
        String vn;
        vn=s.next();
        v.setVehicleNo(vn);
        
        System.out.println("Vehicle Type: ");        
        String type=s.next();
        
        if(type.equalsIgnoreCase("TwoWheeler")||type.equalsIgnoreCase("Car")||type.equalsIgnoreCase("Truck")){
            v.setVehicleType(type);
            
        }
        
        }
        
        
        System.out.println("Slot No: ");        
        int slot=s.nextInt();
         if(slot<=40){
        if(gaddi.isEmpty()){
            v.setSlotNo(slot);
        }
            if(!gaddi.isEmpty()){
                for(int i=0; i<gaddi.size(); i++){
                    if(type.equals(gaddi.get(i).vehicleType) && slot!=gaddi.get(i).slotNo){//confirms the vehicle type and slot no. of same index
                        v.setSlotNo(slot);
                    }else if(!type.equals(gaddi.get(i).vehicleType)){
                        v.setSlotNo(slot);
                    }else{
                        throw new SlotNotFoundException("Slot already allotted");
                    }
                }
            }
                        
        }else {
            throw new InvalidSlotException("No Slot Alloted");
        }             
        
//        System.out.println("Parking Duration");
//        v.setParkingDuration(s.nextInt());
        
        gaddi.add(v);        
                
                
        System.out.println(type+" Added Successfully");
        
        return true;
    }
    
    @Override
    public int countUnassignedVehicles() {          
               if(gaddi.size()==1){
                   if(gaddi.get(0).getOwnerObj()==null){
                        count++;
                    }
               }else{
               for(int i=0; i<gaddi.size(); i++){                   
                    if(gaddi.get(i).getOwnerObj()==null){
                        count++;
                    }
               }
               }
        return count;
    }

        
    @Override        
    public ArrayList<Vehicle> getallVehicles(String type) throws InvalidTypeException{
        ArrayList <Vehicle> temp=new ArrayList<>();
        int index=0;
        for(int i=0; i<gaddi.size(); i++){
            if(type.equals(gaddi.get(i).getVehicleType())){                
                temp.add(index, gaddi.get(i));
                index++;
            }else{
                throw new InvalidTypeException("No Vehicle Found");
            }
        }                
        return temp;
    } 
   
    @Override
    public HashMap<String, Integer> getCountAllVehicles() {
        HashMap<String, Integer> hm=new HashMap<>();
        int index=0, tindex=0, trindex=0;
        for(int i=0; i<gaddi.size(); i++){
             if(gaddi.get(i).getVehicleType().equalsIgnoreCase("car")){                                
                index++;
            }else if(gaddi.get(i).getVehicleType().equalsIgnoreCase("twowheeler")){                                
                tindex++;
            }else if(gaddi.get(i).getVehicleType().equalsIgnoreCase("truck")){                                
                trindex++;
            }            
        }
        hm.put("Car", index);
        hm.put("Two Wheeler", tindex);
        hm.put("Truck", trindex);
        
        return hm;
    }

    @Override
    public boolean deleteVehicle(String vn) throws InvalidVehicleException{        
        int i=0; 
        while(!vn.equals(gaddi.get(i).vehicleNo)){
            if(i<gaddi.size()){
                i++;
            }else{
                throw new InvalidVehicleException("Check Vehicle No.");
            }
            
        }
        gaddi.remove(i);
        System.out.println(vn+ " removed Successfully");
        
        
        return true;
    }

    
                          
}






// arraylist
