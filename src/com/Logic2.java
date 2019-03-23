package com;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Logic2 {

	LogicCRUD gaddi = new LogicCRUD();
	Vehicle vehicle = new Vehicle();
	
	public String addVehicle(String vNo, String vType, int slot) throws InvalidVehicleException, InvalidSlotException, SQLException {
		gaddi.connecting();
		ResultSet rs = gaddi.fetchData();
		
		if(rs.next()) {
			vehicle.setVehicleNo(vNo);
			vehicle.setVehicleType(vType);
			vehicle.setSlotNo(slot);
		}
		else{
			vehicle.setVehicleNo(vNo);
			vehicle.setVehicleType(vType);
			vehicle.setSlotNo(slot);
			try {
				gaddi.insertData(vehicle.getVehicleNo(), vehicle.getVehicleType(), vehicle.getVehicleType());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		return vNo;
	}
}
