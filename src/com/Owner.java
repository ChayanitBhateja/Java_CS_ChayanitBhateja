package com;

import java.util.Scanner;

public class Owner {
    String ownerName=new String();
    String ownerAddress=new String();
    String ownerEmail=new String();
    long mobileNo;
    
    Scanner s=new Scanner(System.in);
    
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
