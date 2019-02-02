package com;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class VehicleDAO {
	Vehicle vehicle=new Vehicle();
	Connector connection=new Connector();
	Connection con;
	
	String vNo=vehicle.getVehicleNo();
	int slotNo=vehicle.getSlotNo();
	String vehicleType=vehicle.getVehicleType();
	
	public void save() {
		PreparedStatement statement;
		try {
			con=connection.connect();
			statement=con.prepareStatement("insert into parkingTable values(?,?,?)");
			statement.setString(1, vNo);
			statement.setInt(2, slotNo);
			statement.setString(3,vehicleType);
			statement.executeUpdate();
			con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		
		
	}

}
