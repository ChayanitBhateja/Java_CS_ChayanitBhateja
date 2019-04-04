package com;

import java.sql.SQLException;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

@SuppressWarnings("serial")
public class Design extends javax.swing.JFrame{
	private JTextField txtVehicleNoAdd;
	private JTextField txtSlotAdd;
	private JTextField txtONameAdd;
	private JTextField txtMobileNoAdd;
	private JTextField txtEmailNoAdd;
	private JTextField txtVehicleNo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField_5;
	public Design() {
		
		JPanel panelHead = new JPanel();
		
		JPanel panelMenu = new JPanel();
		
		JPanel panelContent = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panelContent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panelMenu, GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)))
						.addComponent(panelHead, GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panelHead, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelMenu, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelContent, GroupLayout.PREFERRED_SIZE, 436, Short.MAX_VALUE))
		);
		panelContent.setLayout(new CardLayout(0, 0));
		
		JPanel panelAdd = new JPanel();
		panelContent.add(panelAdd, "name_6011478593180");
		
		JLabel lblVehicleType = new JLabel("Vehicle Type");
		lblVehicleType.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel lblSlotNo = new JLabel("Slot No");
		lblSlotNo.setFont(new Font("Dialog", Font.BOLD, 18));
		
		txtVehicleNoAdd = new JTextField();
		txtVehicleNoAdd.setColumns(10);
		
		txtSlotAdd = new JTextField();
		txtSlotAdd.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		
		JLabel lblVehicleNO = new JLabel("Vehicle No");
		lblVehicleNO.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JLabel label_3 = new JLabel("Owner Name");
		label_3.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_4 = new JLabel("Address");
		label_4.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JTextArea txtAddressAdd = new JTextArea();
		
		txtONameAdd = new JTextField();
		txtONameAdd.setColumns(10);
		
		JLabel label_5 = new JLabel("Mobile No");
		label_5.setFont(new Font("Dialog", Font.BOLD, 18));
		
		txtMobileNoAdd = new JTextField();
		txtMobileNoAdd.setColumns(10);
		
		JLabel label_6 = new JLabel("Email");
		label_6.setFont(new Font("Dialog", Font.BOLD, 18));
		
		txtEmailNoAdd = new JTextField();
		txtEmailNoAdd.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel label_7 = new JLabel("Vehicle Details");
		label_7.setFont(new Font("Dialog", Font.BOLD, 24));
		
		JLabel label_8 = new JLabel("Owner Details");
		label_8.setFont(new Font("Dialog", Font.BOLD, 24));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_panelAdd = new GroupLayout(panelAdd);
		gl_panelAdd.setHorizontalGroup(
			gl_panelAdd.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAdd.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panelAdd.createSequentialGroup()
								.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panelAdd.createSequentialGroup()
										.addGap(41)
										.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panelAdd.createSequentialGroup()
												.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING)
													.addComponent(lblVehicleType)
													.addComponent(lblSlotNo))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING, false)
													.addComponent(txtVehicleNoAdd, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
													.addComponent(txtSlotAdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
											.addComponent(lblVehicleNO))
										.addGap(26)
										.addComponent(separator, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
										.addGap(38)
										.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panelAdd.createSequentialGroup()
												.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING)
													.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
													.addComponent(label_4, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING)
													.addComponent(txtONameAdd, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
													.addComponent(txtAddressAdd, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
											.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING, false)
												.addGroup(gl_panelAdd.createSequentialGroup()
													.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(txtMobileNoAdd))
												.addGroup(gl_panelAdd.createSequentialGroup()
													.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(txtEmailNoAdd, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)))))
									.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 904, Short.MAX_VALUE))
								.addContainerGap())
							.addGroup(gl_panelAdd.createSequentialGroup()
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
								.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
								.addGap(234)))
						.addGroup(Alignment.TRAILING, gl_panelAdd.createSequentialGroup()
							.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panelAdd.setVerticalGroup(
			gl_panelAdd.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAdd.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_panelAdd.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_7)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelAdd.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_panelAdd.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblVehicleNO)
								.addComponent(txtVehicleNoAdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panelAdd.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblVehicleType, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panelAdd.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSlotNo)
								.addComponent(txtSlotAdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelAdd.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panelAdd.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtONameAdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(9)
							.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAddressAdd, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panelAdd.createParallelGroup(Alignment.LEADING)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panelAdd.createSequentialGroup()
									.addGap(3)
									.addComponent(txtMobileNoAdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_panelAdd.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEmailNoAdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelAdd.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
					.addGroup(gl_panelAdd.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panelAdd.setLayout(gl_panelAdd);
		
		JPanel panelVehicleDetail = new JPanel();
		panelContent.add(panelVehicleDetail, "name_6030308898946");
		
		JLabel lblVehicleNo = new JLabel("Vehicle NO");
		
		txtVehicleNo = new JTextField();
		txtVehicleNo.setColumns(10);
		
		JButton btnSubmitSearch = new JButton("Submit");
		btnSubmitSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel label = new JLabel("Vehicle Type");
		label.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_1 = new JLabel("Slot No");
		label_1.setFont(new Font("Dialog", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"TwoWheeler", "Car", "Truck"}));
		comboBox_1.setToolTipText("");
		
		JLabel label_2 = new JLabel("Vehicle No");
		label_2.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		
		JLabel label_9 = new JLabel("Owner Name");
		label_9.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_10 = new JLabel("Address");
		label_10.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JTextArea textArea = new JTextArea();
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel label_11 = new JLabel("Mobile No");
		label_11.setFont(new Font("Dialog", Font.BOLD, 18));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel label_12 = new JLabel("Email");
		label_12.setFont(new Font("Dialog", Font.BOLD, 18));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JSeparator separator_3 = new JSeparator();
		
		JLabel label_13 = new JLabel("Vehicle Details");
		label_13.setFont(new Font("Dialog", Font.BOLD, 24));
		
		JLabel label_14 = new JLabel("Owner Details");
		label_14.setFont(new Font("Dialog", Font.BOLD, 24));
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_panelVehicleDetail = new GroupLayout(panelVehicleDetail);
		gl_panelVehicleDetail.setHorizontalGroup(
			gl_panelVehicleDetail.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelVehicleDetail.createSequentialGroup()
					.addGap(300)
					.addComponent(lblVehicleNo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtVehicleNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnSubmitSearch)
					.addContainerGap(311, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panelVehicleDetail.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panelVehicleDetail.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelVehicleDetail.createSequentialGroup()
							.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
							.addGap(240)
							.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 904, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelVehicleDetail.createSequentialGroup()
							.addGap(41)
							.addGroup(gl_panelVehicleDetail.createParallelGroup(Alignment.LEADING)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
							.addGap(12)
							.addGroup(gl_panelVehicleDetail.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addGroup(gl_panelVehicleDetail.createParallelGroup(Alignment.LEADING)
								.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
							.addGap(5)
							.addGroup(gl_panelVehicleDetail.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelVehicleDetail.createSequentialGroup()
									.addGap(7)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelVehicleDetail.createSequentialGroup()
									.addGap(7)
									.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panelVehicleDetail.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnDone, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		gl_panelVehicleDetail.setVerticalGroup(
			gl_panelVehicleDetail.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelVehicleDetail.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelVehicleDetail.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVehicleNo)
						.addComponent(txtVehicleNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSubmitSearch))
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addGroup(gl_panelVehicleDetail.createParallelGroup(Alignment.LEADING)
						.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_panelVehicleDetail.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelVehicleDetail.createSequentialGroup()
							.addGap(19)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelVehicleDetail.createSequentialGroup()
							.addGap(22)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelVehicleDetail.createSequentialGroup()
							.addGap(12)
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addGap(83)
							.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelVehicleDetail.createSequentialGroup()
							.addGap(15)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addComponent(btnDone, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(56))
		);
		panelVehicleDetail.setLayout(gl_panelVehicleDetail);
		
		JPanel panelSearchType = new JPanel();
		panelContent.add(panelSearchType, "name_6843202808470");
		
		JLabel lblChooseVehicleType = new JLabel("Choose Vehicle Type");
		
		JComboBox comboBoxSearchType = new JComboBox();
		comboBoxSearchType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			}
		});
		comboBoxSearchType.setModel(new DefaultComboBoxModel(new String[] {"TwoWheeler", "Car", "Truck"}));
		
		JButton btnSubmit_1 = new JButton("Submit");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panelSearchType = new GroupLayout(panelSearchType);
		gl_panelSearchType.setHorizontalGroup(
			gl_panelSearchType.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSearchType.createSequentialGroup()
					.addGroup(gl_panelSearchType.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelSearchType.createSequentialGroup()
							.addGap(308)
							.addComponent(lblChooseVehicleType)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxSearchType, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnSubmit_1))
						.addGroup(gl_panelSearchType.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panelSearchType.setVerticalGroup(
			gl_panelSearchType.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSearchType.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelSearchType.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChooseVehicleType)
						.addComponent(comboBoxSearchType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSubmit_1))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Vehicle Name", "VehicleType", "SlotNo", "OwnerName", "Address", "MobileNo", "Email"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class, String.class, String.class, Long.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		panelSearchType.setLayout(gl_panelSearchType);
		
		JPanel panelDeleteVehicle = new JPanel();
		panelContent.add(panelDeleteVehicle, "name_7558518637434");
		
		JLabel lblVehicleNo_1 = new JLabel("Vehicle No");
		lblVehicleNo_1.setFont(new Font("Dialog", Font.BOLD, 20));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JButton btnSubmit_2 = new JButton("Submit");
		btnSubmit_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblVehicleDeleted = new JLabel("Vehicle Deleted");
		lblVehicleDeleted.setFont(new Font("Dialog", Font.BOLD, 22));
		GroupLayout gl_panelDeleteVehicle = new GroupLayout(panelDeleteVehicle);
		gl_panelDeleteVehicle.setHorizontalGroup(
			gl_panelDeleteVehicle.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDeleteVehicle.createSequentialGroup()
					.addGroup(gl_panelDeleteVehicle.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelDeleteVehicle.createSequentialGroup()
							.addGap(351)
							.addGroup(gl_panelDeleteVehicle.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnSubmit_2)
								.addGroup(gl_panelDeleteVehicle.createSequentialGroup()
									.addComponent(lblVehicleNo_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panelDeleteVehicle.createSequentialGroup()
							.addGap(384)
							.addComponent(lblVehicleDeleted)))
					.addContainerGap(355, Short.MAX_VALUE))
		);
		gl_panelDeleteVehicle.setVerticalGroup(
			gl_panelDeleteVehicle.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panelDeleteVehicle.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDeleteVehicle.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVehicleNo_1)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnSubmit_2)
					.addGap(73)
					.addComponent(lblVehicleDeleted)
					.addContainerGap(308, Short.MAX_VALUE))
		);
		panelDeleteVehicle.setLayout(gl_panelDeleteVehicle);
		
		JButton btnAddVehicle = new JButton("Add a Vehicle");
		btnAddVehicle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnDetailByNo = new JButton("Search By No");
		btnDetailByNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnDetailByType = new JButton("Search By Type");
		btnDetailByType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnDelete = new JButton("Delete a Vehicle");
		GroupLayout gl_panelMenu = new GroupLayout(panelMenu);
		gl_panelMenu.setHorizontalGroup(
			gl_panelMenu.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAddVehicle, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addComponent(btnDetailByNo, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDetailByType, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panelMenu.setVerticalGroup(
			gl_panelMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelMenu.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddVehicle, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDetailByType, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDetailByNo, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panelMenu.setLayout(gl_panelMenu);
		
		JLabel lblTitle = new JLabel("Virtual Parking Management System");
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 30));
		GroupLayout gl_panelHead = new GroupLayout(panelHead);
		gl_panelHead.setHorizontalGroup(
			gl_panelHead.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelHead.createSequentialGroup()
					.addContainerGap(168, Short.MAX_VALUE)
					.addComponent(lblTitle)
					.addGap(130))
		);
		gl_panelHead.setVerticalGroup(
			gl_panelHead.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHead.createSequentialGroup()
					.addGap(39)
					.addComponent(lblTitle)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		panelHead.setLayout(gl_panelHead);
		getContentPane().setLayout(groupLayout);
	}
}
