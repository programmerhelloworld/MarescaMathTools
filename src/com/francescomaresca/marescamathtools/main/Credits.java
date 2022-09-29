/*
Francesco Maresca's Maresca Math Tools. 
Copyright (C) 2022 Francesco Maresca (@programmerhelloworld). All rights reserved.
*/
package com.francescomaresca.marescamathtools.main;
import com.francescomaresca.marescamathtools.main.GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Credits {

	private JFrame frmCrediras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credits window = new Credits();
					window.frmCrediras.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Credits() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrediras = new JFrame();
		frmCrediras.getContentPane().setBackground(Color.WHITE);
		frmCrediras.setTitle("Credits");
		frmCrediras.setResizable(false);
		frmCrediras.setBounds(100, 100, 450, 300);
		frmCrediras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextPane txtpnFrancescoMarescasMaresca = new JTextPane();
		txtpnFrancescoMarescasMaresca.setText("Francesco Maresca's Maresca Math Tools. Copyright (C) 2022 Francesco Maresca (GitHub: @programmerhelloworld). All rights reserved.");
		txtpnFrancescoMarescasMaresca.setEditable(false);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI e1 = new GUI();
				e1.main(null);
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmCrediras.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(102)
							.addComponent(txtpnFrancescoMarescasMaresca, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton))
					.addContainerGap(90, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(btnNewButton)
					.addGap(37)
					.addComponent(txtpnFrancescoMarescasMaresca, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(114, Short.MAX_VALUE))
		);
		frmCrediras.getContentPane().setLayout(groupLayout);
	}
}
