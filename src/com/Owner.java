package com;

import java.util.Scanner;

public class Owner {
    String ownerName;
    String ownerAddress;
    String ownerEmail;
    long mobileNo;
    
    public Owner(String ownerName, String ownerAddress, String ownerEmail, long mobileNo) {
		super();
		this.ownerName = ownerName;
		this.ownerAddress = ownerAddress;
		this.ownerEmail = ownerEmail;
		this.mobileNo = mobileNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (mobileNo ^ (mobileNo >>> 32));
		result = prime * result + ((ownerAddress == null) ? 0 : ownerAddress.hashCode());
		result = prime * result + ((ownerEmail == null) ? 0 : ownerEmail.hashCode());
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
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
		Owner other = (Owner) obj;
		if (mobileNo != other.mobileNo)
			return false;
		if (ownerAddress == null) {
			if (other.ownerAddress != null)
				return false;
		} else if (!ownerAddress.equals(other.ownerAddress))
			return false;
		if (ownerEmail == null) {
			if (other.ownerEmail != null)
				return false;
		} else if (!ownerEmail.equals(other.ownerEmail))
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}

	public String getOwnerName(){
        return ownerName;
    }
    
    public void setOwnerName(String oName){
        this.ownerName=oName;
    }
    
    public String getOwnerAddress(){
        return ownerAddress;
    }
    
    public void setOwnerAddress(String oAdd){
        this.ownerAddress=oAdd;
    }
    
    public String getOwnerEmail(){
        return ownerEmail;
    }
    
    public void setOwnerEmail(String oEmail){
        this.ownerEmail=oEmail;
    }
    
    public long getMobileNO(){
        return mobileNo;
    }
    
    public void setMobileNO(long mNo){
        this.mobileNo=mNo;
    }
    
    
}
