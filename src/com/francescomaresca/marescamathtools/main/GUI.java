/*
Francesco Maresca's Maresca Math Tools. 
Copyright (C) 2022 Francesco Maresca (@programmerhelloworld). All rights reserved.
*/
package com.francescomaresca.marescamathtools.main;
import org.python.util.PythonInterpreter;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.francescomaresca.marescamathtools.main.VolumeCalculator;
import com.francescomaresca.marescamathtools.main.Calculator;
import com.francescomaresca.marescamathtools.main.Credits;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;


public class GUI {

	private JFrame frmFrancescoMarescasMath;
	private JTextField txtFrancescoMarescas;
	private JButton btnNewButton_2;
	private JTextField txtCopyrightc;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmFrancescoMarescasMath.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFrancescoMarescasMath = new JFrame();
		frmFrancescoMarescasMath.getContentPane().setBackground(Color.WHITE);
		frmFrancescoMarescasMath.setResizable(false);
		frmFrancescoMarescasMath.setTitle("Francesco Maresca's Maresca Math Tools");
		frmFrancescoMarescasMath.setBounds(100, 100, 450, 300);
		frmFrancescoMarescasMath.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Volume Calculator");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFrancescoMarescasMath.dispose();
				VolumeCalculator volclass = new VolumeCalculator();
				volclass.main(null);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Calculator");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFrancescoMarescasMath.dispose();
				Calculator calc = new Calculator();
				calc.main(null);
			}
		});
		
		txtFrancescoMarescas = new JTextField();
		txtFrancescoMarescas.setEditable(false);
		txtFrancescoMarescas.setText("Francesco Maresca's Maresca Math Tools");
		txtFrancescoMarescas.setFont(new Font("YuKyokasho", Font.BOLD, 19));
		txtFrancescoMarescas.setColumns(10);
		
		btnNewButton_2 = new JButton("Credits");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFrancescoMarescasMath.dispose();
				Credits cr = new Credits();
				cr.main(null);
				
			}
		});
		
		txtCopyrightc = new JTextField();
		txtCopyrightc.setEditable(false);
		txtCopyrightc.setText("Copyright (C) 2022, Francesco Maresca. All rights reserved.");
		txtCopyrightc.setBackground(Color.WHITE);
		txtCopyrightc.setColumns(10);
		
		textField = new JTextField();
		textField.setText("1.1");
		textField.setEditable(false);
		textField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frmFrancescoMarescasMath.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtCopyrightc, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(50)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtFrancescoMarescas, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(txtFrancescoMarescas, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(58)
							.addComponent(btnNewButton_2)))
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addComponent(txtCopyrightc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		frmFrancescoMarescasMath.getContentPane().setLayout(groupLayout);
	}
}
