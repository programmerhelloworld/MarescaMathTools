/*
Francesco Maresca's Maresca Math Tools. 
Copyright (C) 2023 Francesco Maresca (@programmerhelloworld). All rights reserved.
*/
package com.francescomaresca.marescamathtools.main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import com.francescomaresca.marescamathtools.main.GUI;
import java.awt.Color;

public class VolumeCalculator {


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
    	JFrame frmVolumeCalculator = new JFrame("Francesco Maresca's Volume Calculator");
    	frmVolumeCalculator.setTitle("Volume Calculator - Maresca Math Tools");
    	frmVolumeCalculator.getContentPane().setBackground(Color.WHITE);
        frmVolumeCalculator.setResizable(false);
        frmVolumeCalculator.setBounds(100, 100, 945, 449);
        frmVolumeCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmVolumeCalculator.setVisible(true);

        JTextField textField = new JTextField();
        textField.setBackground(Color.LIGHT_GRAY);
        textField.setEditable(false);
        textField.setColumns(10);

        JTextField textField_1 = new JTextField();
        textField_1.setBackground(Color.LIGHT_GRAY);
        textField_1.setEditable(false);
        textField_1.setColumns(10);

        JTextField textField_2 = new JTextField();
        textField_2.setBackground(Color.LIGHT_GRAY);
        textField_2.setColumns(10);

        JTextField textField_3 = new JTextField();
        textField_3.setBackground(Color.LIGHT_GRAY);
        textField_3.setColumns(10);

        JTextField textField_4 = new JTextField();
        textField_4.setBackground(Color.LIGHT_GRAY);
        textField_4.setColumns(10);

        JButton btnNewButton = new JButton("Calculate pyramid volume");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                float side = Float.parseFloat(textField_4.getText());
                float area;
                float volume;
                float height = Float.parseFloat(textField_3.getText());

                area = side * side;
                volume = (area * height)/3;


                textField_1.setText("" + volume);

            }
        });

        JButton btnNewButton_1 = new JButton("Calculate cube volume");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String strcubeside = textField_2.getText();
                float cubeside = Float.parseFloat(strcubeside);
                float volume = cubeside * cubeside * cubeside;


                textField.setText("" + volume);


            }
        });

        JTextField txtSide = new JTextField();
        txtSide.setText("Side");
        txtSide.setEditable(false);
        txtSide.setBackground(Color.WHITE);
        txtSide.setColumns(10);

        JTextField txtHeight = new JTextField();
        txtHeight.setText("Height");
        txtHeight.setEditable(false);
        txtHeight.setColumns(10);
        txtHeight.setBackground(Color.WHITE);

        JTextField txtSide_1 = new JTextField();
        txtSide_1.setText("Side");
        txtSide_1.setEditable(false);
        txtSide_1.setColumns(10);
        txtSide_1.setBackground(Color.WHITE);

        JTextField txtResult = new JTextField();
        txtResult.setText("Result");
        txtResult.setEditable(false);
        txtResult.setColumns(10);
        txtResult.setBackground(Color.WHITE);

        JTextField txtCubeArea = new JTextField();
        txtCubeArea.setText("Cube Volume");
        txtCubeArea.setEditable(false);
        txtCubeArea.setColumns(10);
        txtCubeArea.setBackground(Color.WHITE);

        JTextField txtPyramidArea = new JTextField();
        txtPyramidArea.setText("Pyramid Volume");
        txtPyramidArea.setEditable(false);
        txtPyramidArea.setColumns(10);
        txtPyramidArea.setBackground(Color.WHITE);

        JSeparator separator = new JSeparator();

        JSeparator separator_1 = new JSeparator();

        JTextField txtRectangularParallelepiped = new JTextField();
        txtRectangularParallelepiped.setText("Rectangular parallelepiped volume");
        txtRectangularParallelepiped.setEditable(false);
        txtRectangularParallelepiped.setColumns(10);
        txtRectangularParallelepiped.setBackground(Color.WHITE);

        JTextField textField_5 = new JTextField();
        textField_5.setBackground(Color.LIGHT_GRAY);
        textField_5.setColumns(10);

        JTextField textField_6 = new JTextField();
        textField_6.setBackground(Color.LIGHT_GRAY);
        textField_6.setColumns(10);
        
        JTextField textField_7 = new JTextField();
        textField_7.setBackground(Color.LIGHT_GRAY);
        textField_7.setColumns(10);
        
        JTextField textField_8 = new JTextField();
        textField_8.setBackground(Color.LIGHT_GRAY);
        textField_8.setEditable(false);
        textField_8.setColumns(10);
        
        JButton btnNewButton_2 = new JButton("Calculate rectang. volume");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                float side1 = Float.parseFloat(textField_5.getText());
                float side2 = Float.parseFloat(textField_6.getText());
                float height = Float.parseFloat(textField_7.getText());

                float vol = side1 * side2 * height;

                textField_8.setText("" + vol);
            }
        });

        

        

        JTextField txtSide_2 = new JTextField();
        txtSide_2.setText("Side 1");
        txtSide_2.setEditable(false);
        txtSide_2.setColumns(10);
        txtSide_2.setBackground(Color.WHITE);

        JTextField txtSide_3 = new JTextField();
        txtSide_3.setText("Side 2");
        txtSide_3.setEditable(false);
        txtSide_3.setColumns(10);
        txtSide_3.setBackground(Color.WHITE);

        JTextField txtSide_4 = new JTextField();
        txtSide_4.setText("Height");
        txtSide_4.setEditable(false);
        txtSide_4.setColumns(10);
        txtSide_4.setBackground(Color.WHITE);

        

        JTextField textField_9 = new JTextField();
        textField_9.setText("Result");
        textField_9.setEditable(false);
        textField_9.setColumns(10);
        textField_9.setBackground(Color.WHITE);

        JTextField textField_10 = new JTextField();
        textField_10.setText("Result");
        textField_10.setEditable(false);
        textField_10.setColumns(10);
        textField_10.setBackground(Color.WHITE);
        
        JButton btnNewButton_3 = new JButton("Menu");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		VolumeCalculator vol = new VolumeCalculator();
        	
        		frmVolumeCalculator.dispose();
        	
        		
        		GUI abc = new GUI();
        		abc.main(args);
        	}
        	
        });
        
        
        GroupLayout groupLayout = new GroupLayout(frmVolumeCalculator.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addContainerGap()
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addContainerGap()
        							.addComponent(txtSide_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addContainerGap()
        							.addComponent(txtCubeArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGap(44)
        					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(btnNewButton_3))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(26)
        					.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(114)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(btnNewButton)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(31)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addComponent(txtSide, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addComponent(txtPyramidArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(183)
        					.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
        			.addGap(22)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(154)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(txtSide_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtSide_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtSide_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        									.addGroup(groupLayout.createSequentialGroup()
        										.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        										.addGap(60))
        									.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)))
        							.addGap(18))
        						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
        							.addGap(112)))
        					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(95)
        					.addComponent(txtRectangularParallelepiped, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(38, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(btnNewButton_3)
        			.addGap(5)
        			.addComponent(txtCubeArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
        			.addComponent(txtSide_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        			.addGap(44)
        			.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(3)
        			.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtRectangularParallelepiped, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtPyramidArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(12)
        					.addComponent(txtSide_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(txtSide_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(8)
        					.addComponent(txtSide_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(btnNewButton_2)
        					.addGap(36)
        					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap(87, Short.MAX_VALUE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(txtSide, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(12)
        					.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(btnNewButton)
        							.addGap(73))
        						.addComponent(textField_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        frmVolumeCalculator.getContentPane().setLayout(groupLayout);
    }
}
 
