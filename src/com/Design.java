package com;


@SuppressWarnings("serial")
public class Design extends javax.swing.JFrame{
	logic l=new logic();
	  // Variables declaration - do not modify                     
    private javax.swing.JButton addB;
    private javax.swing.JButton vehicleB;
    private javax.swing.JButton deleteB;
    private javax.swing.JButton exitB;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> vType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel trLabel;
    private javax.swing.JPanel head;
    private javax.swing.JPanel buttonP;
    private javax.swing.JPanel exitP;
    private javax.swing.JPanel contentP;
    private javax.swing.JTextField vNo;
    private javax.swing.JTextField slotNo;
    private javax.swing.JLabel cLabel;
    private javax.swing.JPanel detailP;
    private javax.swing.JLabel tLabel;
    private javax.swing.JLabel vDetail;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jButton5;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton rOK;
    private javax.swing.JLabel removeL;
    private javax.swing.JPanel removeP;
    private javax.swing.JLabel vrLabel;
    private javax.swing.JTextField vrText;
    
    // End of variables declaration                  
	
	
	public Design() {
		initComponents();
	}
	
	 
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        head = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        buttonP = new javax.swing.JPanel();
	        addB = new javax.swing.JButton();
	        vehicleB = new javax.swing.JButton();
	        deleteB = new javax.swing.JButton();
	        contentP = new javax.swing.JPanel();
	        detailP = new javax.swing.JPanel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        vNo = new javax.swing.JTextField();
	        jLabel4 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        vType = new javax.swing.JComboBox<>();
	        slotNo = new javax.swing.JTextField();
	        submit = new javax.swing.JButton();
	        exitP = new javax.swing.JPanel();
	        exitB = new javax.swing.JButton();
	        jTextField3 = new javax.swing.JTextField();
	        removeP = new javax.swing.JPanel();
	        removeL = new javax.swing.JLabel();
	        vrLabel = new javax.swing.JLabel();
	        vrText = new javax.swing.JTextField();
	        rOK = new javax.swing.JButton();
                vDetail = new javax.swing.JLabel();
                tLabel = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                cLabel = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                jButton5 = new javax.swing.JButton();
                trLabel = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setName("frame"); // NOI18N

	        head.setName("head"); // NOI18N

	        jLabel1.setFont(new java.awt.Font("Linus Text", 1, 24)); // NOI18N
	        jLabel1.setText("Virtual Parking Management System");
	        jLabel1.setName("headL"); // NOI18N

	        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
	        head.setLayout(headLayout);
	        headLayout.setHorizontalGroup(
	            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headLayout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(162, 162, 162))
	        );
	        headLayout.setVerticalGroup(
	            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headLayout.createSequentialGroup()
	                .addContainerGap(19, Short.MAX_VALUE)
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap())
	        );

	        buttonP.setName("buttonP"); // NOI18N

	        addB.setText("Add Vehicle");
	        addB.setName("addB"); // NOI18N
	        addB.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                addBActionPerformed(evt);
	            }
	        });

	        vehicleB.setText("All Vehicle Details");
	        vehicleB.setName("vehicleB"); // NOI18N
	        vehicleB.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                vehicleBActionPerformed(evt);
	            }
	        });

	        deleteB.setText("Delete Vehicle");
	        deleteB.setName("deleteB"); // NOI18N
	        deleteB.addActionListener(new java.awt.event.ActionListener() {
                    @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                deleteBActionPerformed(evt) ;
	            }
	        });

	        contentP.setName("contentP"); // NOI18N
	        contentP.setVisible(false);
	        
	        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        jLabel2.setText("Add Vehicle information");

	        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
	        jLabel3.setText("Vehicle No");
	        jLabel3.setName("vNo"); // NOI18N

	        vNo.setName("vNo"); // NOI18N

	        jLabel4.setText("Vehicle Type");

	        jLabel5.setText("Slot No");

	        vType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TwoWheeler", "Car", "Truck" }));
	        vType.setName("vType"); // NOI18N

	        slotNo.setName("slotNo"); // NOI18N

	        submit.setText("Submit");
	        submit.setName("submit"); // NOI18N
	        submit.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                try {
						submitActionPerformed(evt);
					} catch (InvalidVehicleException | InvalidSlotException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        });

	        javax.swing.GroupLayout contentPLayout = new javax.swing.GroupLayout(contentP);
	        contentP.setLayout(contentPLayout);
	        contentPLayout.setHorizontalGroup(
	            contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(contentPLayout.createSequentialGroup()
	                .addGroup(contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(contentPLayout.createSequentialGroup()
	                        .addGap(32, 32, 32)
	                        .addGroup(contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(contentPLayout.createSequentialGroup()
	                                .addGroup(contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
	                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addGroup(contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addComponent(vNo)
	                                    .addComponent(vType, 0, 123, Short.MAX_VALUE)
	                                    .addComponent(slotNo)))))
	                    .addGroup(contentPLayout.createSequentialGroup()
	                        .addGap(256, 256, 256)
	                        .addComponent(submit)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        contentPLayout.setVerticalGroup(
	            contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(contentPLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addGroup(contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(vNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(vType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(slotNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addComponent(submit)
	                .addContainerGap(59, Short.MAX_VALUE))
	        );

	        detailP.setVisible(false);
	        vDetail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        vDetail.setText("Vehicle Details");

	        tLabel.setText("twoWheeler");

	        cLabel.setText("car");

	        trLabel.setText("truck");

	        jButton5.setText("ok");
	        jButton5.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton5ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout detailPLayout = new javax.swing.GroupLayout(detailP);
	        detailP.setLayout(detailPLayout);
	        detailPLayout.setHorizontalGroup(
	            detailPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(detailPLayout.createSequentialGroup()
	                .addGroup(detailPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(detailPLayout.createSequentialGroup()
	                        .addGap(29, 29, 29)
	                        .addComponent(vDetail))
	                    .addGroup(detailPLayout.createSequentialGroup()
	                        .addGap(62, 62, 62)
	                        .addGroup(detailPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(tLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
	                            .addComponent(cLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(trLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(detailPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(jTextField3)
	                            .addComponent(jTextField1)
	                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
	                    .addGroup(detailPLayout.createSequentialGroup()
	                        .addGap(114, 114, 114)
	                        .addComponent(jButton5)))
	                .addContainerGap(42, Short.MAX_VALUE))
	        );
	        detailPLayout.setVerticalGroup(
	            detailPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(detailPLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(vDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(detailPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(tLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(detailPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(cLabel)
	                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(detailPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(trLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jButton5)
	                .addContainerGap(44, Short.MAX_VALUE))
	        );
	        	        
	        removeP.setVisible(false);
	        removeL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        removeL.setText("Delete a Vehicle");

	        vrLabel.setText("VehicleNo");
	       
	        rOK.setText("ok");
	        rOK.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                try {
						rOKActionPerformed(evt);
					} catch (InvalidVehicleException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        });

	        javax.swing.GroupLayout removePLayout = new javax.swing.GroupLayout(removeP);
	        removeP.setLayout(removePLayout);
	        removePLayout.setHorizontalGroup(
	            removePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(removePLayout.createSequentialGroup()
	                .addGroup(removePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(removePLayout.createSequentialGroup()
	                        .addGap(29, 29, 29)
	                        .addComponent(removeL))
	                    .addGroup(removePLayout.createSequentialGroup()
	                        .addGap(62, 62, 62)
	                        .addComponent(vrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(vrText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(removePLayout.createSequentialGroup()
	                        .addGap(136, 136, 136)
	                        .addComponent(rOK)))
	                .addContainerGap(42, Short.MAX_VALUE))
	        );
	        removePLayout.setVerticalGroup(
	            removePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(removePLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(removeL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addGroup(removePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(vrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(vrText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(rOK)
	                .addContainerGap(94, Short.MAX_VALUE))
	        );

	        
	        javax.swing.GroupLayout buttonPLayout = new javax.swing.GroupLayout(buttonP);
	        buttonP.setLayout(buttonPLayout);
	        buttonPLayout.setHorizontalGroup(
	            buttonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(buttonPLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(77, 77, 77)
	                .addComponent(vehicleB, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
	                .addComponent(deleteB, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(25, 25, 25))
	            .addGroup(buttonPLayout.createSequentialGroup()
	                .addGap(115, 115, 115)
	                .addComponent(contentP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addComponent(detailP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addComponent(removeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        buttonPLayout.setVerticalGroup(
	            buttonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(buttonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(addB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
	                    .addComponent(vehicleB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(deleteB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(contentP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addComponent(detailP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addComponent(removeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	        );
	        
	        
	       


	        exitP.setName("exitP"); // NOI18N

	        exitB.setText("Exit");
	        exitB.setName("exitB"); // NOI18N
	        exitB.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                exitBActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout exitPLayout = new javax.swing.GroupLayout(exitP);
	        exitP.setLayout(exitPLayout);
	        exitPLayout.setHorizontalGroup(
	            exitPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPLayout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(35, 35, 35))
	        );
	        exitPLayout.setVerticalGroup(
	            exitPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(exitB, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
	                .addContainerGap())
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(57, 57, 57)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(buttonP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(exitP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap(63, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(buttonP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(exitP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap())
	        );

	        pack();
	    }// </editor-fold>                        
	 	
	    private void addBActionPerformed(java.awt.event.ActionEvent evt) {       //add main button..                                  
	        // TODO add your handling code here:	    		    	
	    	if(detailP.isVisible()) {
	    		detailP.setVisible(false);
	    	}else if(removeP.isVisible()) {
	    		removeP.setVisible(false);
	    	}	    		    		    	
	    	contentP.setVisible(true);
	    }                                        

	    private void vehicleBActionPerformed(java.awt.event.ActionEvent evt) {    //count...                                     
	        // TODO add your handling code here:
	    	if(contentP.isVisible()) {
	    		contentP.setVisible(false);
	    	}else if(removeP.isVisible()) {
	    		removeP.setVisible(false);
	    	}	    		    		   	   
	    	detailP.setVisible(true);
	    	System.out.println("detailP is visible..");
	    	jTextField1.setText(String.valueOf(l.index));//car
	    	jTextField3.setText(String.valueOf(l.tindex));//twowheeler
	    	jTextField2.setText(String.valueOf(l.trindex));//truck
	    	
	    }                                        

	    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {    //ok Button...                                     
	        // TODO add your handling code here:	    		    
	    	
	    	detailP.setVisible(false);	    	
	    }  
	    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) { //delete button                                        
	        // TODO add your handling code here:
	    	if(contentP.isVisible()) {
	    		contentP.setVisible(false);
	    	}else if(detailP.isVisible()) {
    		    detailP.setVisible(false);
	    	}
	    	removeP.setVisible(true);
	    	
	    }                                        

	    private void submitActionPerformed(java.awt.event.ActionEvent evt) throws InvalidVehicleException, InvalidSlotException {  //submit Button                          
	        // TODO add your handling code here:
	    	String vehicleNo=vNo.getText();
	    	String vehicleType=(String) vType.getSelectedItem();
	    	int slot=Integer.valueOf(slotNo.getText());
	    	l.addVehicle(vehicleNo, vehicleType, slot);	//passing data to logic class;    	
	    	vNo.setText("");
	    	vType.setSelectedIndex(0);
	    	slotNo.setText("");
	    	
	    }   
	    
	    private void rOKActionPerformed(java.awt.event.ActionEvent evt) throws InvalidVehicleException {//remove ok button                                    
	        // TODO add your handling code here:
	    	String vehicleNo=vrText.getText();
	    	l.deleteVehicle(vehicleNo);//sending data to logic class..
	    	removeP.setVisible(false);	    	
	    }  
	    
	    private void exitBActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	    	System.exit(0);
	    }                                        


	
	
}
