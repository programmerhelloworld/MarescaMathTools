/*
Francesco Maresca's Maresca Math Tools. 
Copyright (C) 2022 Francesco Maresca (@programmerhelloworld). All rights reserved.
*/
package com.francescomaresca.marescamathtools.main;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.SystemColor;
import com.francescomaresca.marescamathtools.main.GUI;

public class TwoNumbersCalculator {
	

	//GUI PROGRAM VERSION
	// COPYRIGHT © 2021, FRANCESCO MARESCA.
	
	
	
	

	private JFrame frmFrancescoMarescasCalculator;
	protected JTextField textField;
	protected JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtAddition;
	private JTextField txtSubstraction;
	private JTextField textField_3;
	private JTextField txtMultiplication;
	private JTextField txtDivision;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_4;
	private JTextField txtRemainder;
	private JTextField txtFirstNumber;
	private JTextField txtSecondNumber;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoNumbersCalculator window = new TwoNumbersCalculator();
					window.frmFrancescoMarescasCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TwoNumbersCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFrancescoMarescasCalculator = new JFrame();
		frmFrancescoMarescasCalculator.getContentPane().setBackground(Color.WHITE);
		frmFrancescoMarescasCalculator.setBackground(Color.WHITE);
		frmFrancescoMarescasCalculator.setResizable(false);
		frmFrancescoMarescasCalculator.setTitle("Francesco Maresca's Two Numbers Calculator");
		frmFrancescoMarescasCalculator.setAutoRequestFocus(false);
		frmFrancescoMarescasCalculator.setBounds(100, 100, 561, 528);
		frmFrancescoMarescasCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setColumns(10);
		
		//result button
		JButton btnNewButton_1 = new JButton("Result");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		//		float firstnumber = Float.parseFloat(textField.getText());
			//	float secondnumber = Float.parseFloat(textField_1.getText());
				
				float result1 =	Float.parseFloat(textField.getText());
				float result2 = Float.parseFloat(textField_1.getText());
				//float result = Float.parseFloat(result1 + result2);
				float addition = (result1 + result2);
				float substraction = (result1-result2);
				float multiplication = (result1 * result2);
				float division = (result1 / result2);
				float remainder = (result1 % result2);
				
	
	    
		textField_2.setText(Float.toString(addition));
		textField_3.setText(Float.toString(substraction));
		textField_6.setText(Float.toString(multiplication));
		textField_5.setText(Float.toString(division));
		textField_4.setText(Float.toString(remainder));
		
		
		
			}
		});
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setVisible(true);
		
		txtAddition = new JTextField();
		txtAddition.setBackground(Color.WHITE);
		txtAddition.setText("Addition");
		txtAddition.setEditable(false);
		txtAddition.setColumns(10);
		
		txtSubstraction = new JTextField();
		txtSubstraction.setText("Substraction");
		txtSubstraction.setEditable(false);
		txtSubstraction.setColumns(10);
		txtSubstraction.setBackground(Color.WHITE);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setVisible(true);
		
		txtMultiplication = new JTextField();
		txtMultiplication.setText("Multiplication");
		txtMultiplication.setEditable(false);
		txtMultiplication.setColumns(10);
		txtMultiplication.setBackground(Color.WHITE);
		
		txtDivision = new JTextField();
		txtDivision.setText("Division");
		txtDivision.setEditable(false);
		txtDivision.setColumns(10);
		txtDivision.setBackground(Color.WHITE);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		txtRemainder = new JTextField();
		txtRemainder.setText("Remainder");
		txtRemainder.setEditable(false);
		txtRemainder.setColumns(10);
		txtRemainder.setBackground(Color.WHITE);
		
		txtFirstNumber = new JTextField();
		txtFirstNumber.setText("First Number");
		txtFirstNumber.setEditable(false);
		txtFirstNumber.setColumns(10);
		txtFirstNumber.setBackground(Color.WHITE);
		
		txtSecondNumber = new JTextField();
		txtSecondNumber.setText("Second Number");
		txtSecondNumber.setEditable(false);
		txtSecondNumber.setColumns(10);
		txtSecondNumber.setBackground(Color.WHITE);
		
		btnNewButton = new JButton("Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI b = new GUI();
				b.main(null);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmFrancescoMarescasCalculator.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(btnNewButton)
					.addGap(62)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(170)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(212, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton_1)
									.addGap(91))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtAddition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtSubstraction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(txtMultiplication, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(96))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(txtDivision, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(109))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtRemainder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, 268, 268, 268))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)))
					.addGap(74))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addComponent(txtFirstNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
					.addComponent(txtSecondNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(138))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtFirstNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSecondNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
					.addGap(50)
					.addComponent(btnNewButton_1)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(13)
							.addComponent(txtAddition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(txtMultiplication, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtSubstraction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDivision, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addComponent(txtRemainder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(61))
		);
		frmFrancescoMarescasCalculator.getContentPane().setLayout(groupLayout);
	}
}
