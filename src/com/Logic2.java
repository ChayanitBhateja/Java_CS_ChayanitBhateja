package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Logic2 {

	LogicCRUD gaddi = new LogicCRUD();
	
	public String addVehicle(String vNo, String vType, int slot, String oName, String oAddress, String oEmail, long oMobile) throws InvalidVehicleException, InvalidSlotException, SQLException {
		gaddi.connecting();
		ResultSet rs = gaddi.fetchData();
		//checking if data is present...
		if(rs.next()) {//if present then it will compare it with the vehicle came by...
			rs.beforeFirst();
			Vehicle vehicle = new Vehicle(vNo, vType, slot);
			Owner owner = new Owner(oName, oAddress, oEmail, oMobile);
			while(rs.next()) {//will run until it will find database is having that vehicle no or not
				if(vehicle.getVehicleNo().equals(rs.getString(1))) {//if vehicle no matched which should not be there...
						throw new InvalidVehicleException();
				}
			}
			//wrote outside the loop to not to duplicate the insertion..and inserting the data here..
			try {
				gaddi.insertData(vehicle, owner);
				
				gaddi.disconnect();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		//if no data is present then the data directly will be entered to the database...
		else{
			Vehicle vehicle = new Vehicle(vNo, vType, slot);
			Owner owner = new Owner(oName, oAddress, oEmail, oMobile);
			try {
				gaddi.insertData(vehicle, owner);
				
				gaddi.disconnect();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	
		
		return vNo;
	}
	
	
	public Set<Object> vehicleDetailsByNo(String vehicleNo) {
		
		gaddi.connecting();
		Set<Object> combinedSet = new HashSet<Object>();
		try {
			ResultSet rs1 = gaddi.searchVehicle(vehicleNo);
 			ResultSet rs2 = gaddi.searchOwner(vehicleNo);
 			
 			
 			while(rs1.next()) {
 				Vehicle vehicle = new Vehicle(rs1.getString(1), rs1.getString(2), rs1.getInt(3));
 				combinedSet.add(vehicle);
 			}
 			
 			while(rs2.next()) {
 				Owner owner = new Owner(rs2.getString(1), rs2.getString(2), rs2.getString(3), rs2.getLong(4));
 				combinedSet.add(owner);
 			}
 			gaddi.disconnect();
 			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return combinedSet;
	}
	
	public ArrayList<Vehicle> vehicleDetailsByType(String vehicleType) {
		gaddi.connecting();
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		try {
			ResultSet rs=gaddi.getVehicleDetails(vehicleType);
			while(rs.next()) {
				Vehicle vehicle = new Vehicle(rs.getString(1), rs.getString(2), rs.getInt(3));
				list.add(vehicle);				
			}
			gaddi.disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public String deleteVehicle(String vehicleNo) {
		gaddi.connecting();
		try {
			gaddi.deleteData(vehicleNo);
			gaddi.disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehicleNo;
	}
}