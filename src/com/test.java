package com;

import java.util.HashMap;
import java.util.Scanner;




public class test {
   //static Vehicle v= new Vehicle();
      static  ParkingManagement p= new ParkingManagement();       
    static int i=0;
    public static void main(String[] args) throws InvalidSlotException, SlotNotFoundException, InvalidTypeException, InvalidVehicleException{
        System.out.println("Welcome to VMPS: Created By Chayanit Bhateja");
  
        Scanner s=new Scanner(System.in);

        display(s);
        
        
        
        
    }   
    
   
        
        public static void display(Scanner f) throws InvalidSlotException, SlotNotFoundException, InvalidTypeException, InvalidVehicleException{
        Vehicle v= new Vehicle();
        System.out.println("Press 1 to Add a Vehicle");
        System.out.println("Press 2 to Count Unassigned Vehicles");
        System.out.println("Press 3 to Get All Vehicle Details");
        System.out.println("Press 4 to Count All Vehicles");
        System.out.println("Press 5 to Clear a Slot");
        i=f.nextInt();
//        try {
                 switch(i){
                     case 1:
                         p.addVehicleTOSlot(v);
//                         display(s);
                         break;
                         
                     case 2:
                         System.out.println(p.countUnassignedVehicles());

                         break;
                         
                     case 3:
                         System.out.print("Enter the Type of Vehicle: ");
                         String type=f.next();
                         if(p.gaddi.size()==1){
                            for (int g = 0; g<p.getallVehicles(type).size(); g++){
                            System.out.println("Vehicle No:"+p.getallVehicles(type).get(g).vehicleNo+"    Slot No: "+p.getallVehicles(type).get(g).slotNo);
                            System.out.println("");
                         }
                         }else{ 
                            for (int g = 0; g<p.getallVehicles(type).size(); g++){
                                System.out.println("Vehicle No:"+p.getallVehicles(type).get(g).vehicleNo+"    Slot No: "+p.getallVehicles(type).get(g).slotNo);
                                System.out.println("");
                            }
                         }   

                         break;
                         
                     case 4:
                         HashMap<String, Integer>hm=p.getCountAllVehicles();
//                          System.out.println(hm.values());
                         hm.entrySet().forEach((entry) -> {
                             String key=entry.getKey();
                             int b=entry.getValue();
                             System.out.println(key+" "+b);
                          });    
                            break;
                         
                     case 5:
                         System.out.println("Enter Vehicle No");
                         String no=f.next();
                         p.deleteVehicle(no);

                         break;
                         
                     default:
                         System.out.print("default"
                                 + "");
                 }                
            display(f);//koi dikkat nahi..chalne do..
        }
        
}
