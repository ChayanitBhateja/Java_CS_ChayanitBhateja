package com;

import java.util.ArrayList;
import java.util.HashMap;

public interface VehicleParking{
    public boolean addVehicleTOSlot(Vehicle v) throws InvalidSlotException, InvalidTypeException, SlotNotFoundException;
    
    public int countUnassignedVehicles();
    
    public ArrayList<Vehicle> getallVehicles(String s) throws InvalidTypeException;
    
    public HashMap<String,Integer> getCountAllVehicles();
    
    public boolean deleteVehicle(String vn) throws InvalidVehicleException;
    
    
}
