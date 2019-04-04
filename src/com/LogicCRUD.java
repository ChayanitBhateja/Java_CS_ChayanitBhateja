package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LogicCRUD {
	
	Connector connection = new Connector();
	Connection con;
	ResultSet rs;
	public void connecting() {
		try {
			con=connection.connect();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet fetchData() throws SQLException {
		this.connecting();
		String query="select * from parkingTable";
		Statement statement = con.createStatement();
		rs=statement.executeQuery(query);
//		con.close();
		return rs;
	}
	
	public void insertData(Vehicle vehicle, Owner owner) throws SQLException {
		String query="insert into parkingTable values(?,?,?,?)";
		String ownerQuery="insert into ownerTable values(?,?,?,?)";
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		String timeStamp=dtf.format(now); 
		
		PreparedStatement statement=con.prepareStatement(query);//setting vehicle details..
		statement.setString(1, vehicle.getVehicleNo());
		statement.setString(2, vehicle.getVehicleType());
		statement.setInt(3, vehicle.getSlotNo());
		statement.setString(4, timeStamp);
		PreparedStatement ownerStatment=con.prepareStatement(ownerQuery);//setting owner details...
		ownerStatment.setString(1, owner.getOwnerName());
		ownerStatment.setString(2, owner.getOwnerAddress());
		ownerStatment.setString(3, owner.getOwnerEmail());
		ownerStatment.setLong(4, owner.getMobileNO());
		statement.executeUpdate();
		ownerStatment.executeUpdate();
//		con.close();
	}
	
	public ResultSet searchVehicle(String vehicleNo) throws SQLException {//retrieving vehicle details
		String query="select * from parkingTable where vehicleNo=?";
		PreparedStatement statement=con.prepareStatement(query);
		statement.setString(1, query);
		rs=statement.executeQuery();
		con.close();
		return rs;
	}
	
	public ResultSet searchOwner(String vehicleNo) throws SQLException {//retrieving owmer details
		String query="select * from ownerTable where vNo=?";
		PreparedStatement statement=con.prepareStatement(query);
		statement.setString(1, vehicleNo);
		rs=statement.executeQuery();
//		con.close();
		return rs;
	}
	
	public ResultSet getVehicleDetails(String vehicleType) throws SQLException {//retireving list of vehicles..
		String query="select * from parkingTable where vehicleType=?";
		PreparedStatement statement=con.prepareStatement(query);
		statement.setString(1, vehicleType);
		rs=statement.executeQuery();
//		con.close();
		return rs;
	}
	
	public void deleteData(String vehicleNo) throws SQLException {//deletes the data from sql...
		String query="delete from parkingTable where vehicleNo=?";
		String ownerQuery="delete from ownerTable where vNo=?";
		PreparedStatement statement=con.prepareStatement(query);
		statement.setString(1, vehicleNo);
		PreparedStatement ownerStatement=con.prepareStatement(ownerQuery);
		ownerStatement.setString(1, vehicleNo);
		statement.executeUpdate();
		ownerStatement.executeUpdate();
//		con.close();
	}
	
	public void disconnect() throws SQLException {
		con.close();
	}
	
	
	
	
}
