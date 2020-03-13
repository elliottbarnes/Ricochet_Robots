package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.*;

import java.util.*;

public class Settings extends JFrame implements ActionListener {

	JFrame frmSettings;
	JRadioButton rdbtnEasy, rdbtnDifficult, rdbtnSimple, rdbtnComplex, rdbtnRG, rdbtnClassic, rdbtnBY, rdbtnEnable, rdbtnDisable;
	
	public Settings() {
		frmSettings = new JFrame();
		frmSettings.setTitle("Settings");
		frmSettings.setBounds(100, 100, 600, 600);
		frmSettings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon img=new ImageIcon(this.getClass().getResource("/Border.jpg"));
		
		SettingsController sc = new SettingsController();
		
		// Difficulty Buttons
		
		JRadioButton rdbtnEasy = new JRadioButton("EASY");
//		rdbtnEasy.setSelected(true);
		rdbtnEasy.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnEasy.setBounds(116, 202, 109, 23);
		frmSettings.getContentPane().add(rdbtnEasy);
		
		JRadioButton rdbtnDifficult = new JRadioButton("HARD");
		rdbtnDifficult.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnDifficult.setBounds(246, 202, 109, 23);
		frmSettings.getContentPane().add(rdbtnDifficult);
		
		// Board Buttons
		
		JRadioButton rdbtnSimple = new JRadioButton("SIMPLE");
//		rdbtnSimple.setSelected(true);
		rdbtnSimple.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnSimple.setBounds(116, 261, 109, 23);
		frmSettings.getContentPane().add(rdbtnSimple);
		
		JRadioButton rdbtnComplex = new JRadioButton("COMPLEX");
		rdbtnComplex.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnComplex.setBounds(246, 261, 109, 23);
		frmSettings.getContentPane().add(rdbtnComplex);
		
		// labels
		
		JLabel lblDifficulty = new JLabel("Difficulty:");
		lblDifficulty.setBounds(48, 176, 76, 14);
		frmSettings.getContentPane().add(lblDifficulty);
		
		
		JLabel lblBoard = new JLabel("Board:");
		lblBoard.setBounds(48, 237, 46, 14);
		frmSettings.getContentPane().add(lblBoard);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(48, 301, 46, 14);
		frmSettings.getContentPane().add(lblColor);
		
		JLabel lblHint = new JLabel("Hint:");
		lblHint.setBounds(48, 364, 46, 14);
		frmSettings.getContentPane().add(lblHint);
		
		// Colour Buttons
		
		JRadioButton rdbtnRG = new JRadioButton("R-G");
		rdbtnRG.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnRG.setBounds(246, 323, 109, 23);
		frmSettings.getContentPane().add(rdbtnRG);
		
		JRadioButton rdbtnClassic = new JRadioButton("Classic");
//		rdbtnClassic.setSelected(true);
		rdbtnClassic.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnClassic.setBounds(116, 323, 109, 23);
		frmSettings.getContentPane().add(rdbtnClassic);
		
		JRadioButton rdbtnBY = new JRadioButton("B-Y");
		rdbtnBY.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnBY.setBounds(380, 323, 109, 23);
		frmSettings.getContentPane().add(rdbtnBY);
		
		// Hints enabled button
		
		JRadioButton rdbtnEnable = new JRadioButton("ENABLE");
//		rdbtnEnable.setSelected(true);
		rdbtnEnable.setBounds(116, 397, 109, 23);
		frmSettings.getContentPane().add(rdbtnEnable);
		
		JRadioButton rdbtnDisable = new JRadioButton("DISABLE");
		rdbtnDisable.setBounds(246, 397, 109, 23);
		frmSettings.getContentPane().add(rdbtnDisable);
		
		// Start Button
		
		JButton btnStart = new JButton("START");
		btnStart.setForeground(Color.WHITE);
		btnStart.setBackground(new Color(0, 204, 51));
		btnStart.setBounds(199, 460, 192, 51);
		frmSettings.getContentPane().add(btnStart);
		
		// Player Checkboxes
		
		JCheckBox chckbxPlayer4 = new JCheckBox("PLAYER 4");
		chckbxPlayer4.setBounds(427, 108, 97, 23);
		frmSettings.getContentPane().add(chckbxPlayer4);
		
		JCheckBox chckbxPlayer3 = new JCheckBox("PLAYER 3");
		chckbxPlayer3.setBounds(312, 108, 97, 23);
		frmSettings.getContentPane().add(chckbxPlayer3);
		
		JCheckBox chckbxPlayer2 = new JCheckBox("PLAYER2");
		chckbxPlayer2.setBounds(196, 108, 97, 23);
		frmSettings.getContentPane().add(chckbxPlayer2);
		
		JCheckBox chckbxPlayer1 = new JCheckBox("PLAYER 1");
		chckbxPlayer1.setBounds(80, 108, 97, 23);
		frmSettings.getContentPane().add(chckbxPlayer1);
		
		/*
		 * This method closes the settings frame & creates the Game Gui
		 */
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPlayer1.isSelected()) {
					sc.setPlayerNumber(1);
					new GameGUI();
					frmSettings.setVisible(false);
				}else if(chckbxPlayer2.isSelected()){
					sc.setPlayerNumber(2);
					frmSettings.setVisible(false);
				}else if(chckbxPlayer3.isSelected()) {
					sc.setPlayerNumber(3);
					frmSettings.setVisible(false);
				}else if(chckbxPlayer4.isSelected()){
					sc.setPlayerNumber(4);
					frmSettings.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(frmSettings, "One player must be selected");
				}
				
			}
		});
		
		
		JLabel lblNewLabel = new JLabel("SETTINGS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(226, 69, 129, 24);
		frmSettings.getContentPane().add(lblNewLabel);
		
		
		//Background has to be the last, if not the other components won't show
		JLabel background; 
		frmSettings.getContentPane().setLayout(null);
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0, 0, 584, 561);
		frmSettings.getContentPane().add(background);
		
		frmSettings.setVisible(true);
		
		
		rdbtnEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnEasy.isSelected()) {
					
					rdbtnDifficult.setSelected(false);
					
				}
				else {
					rdbtnDifficult.setSelected(true);
				}
				
			}
		});
		
		rdbtnDifficult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnDifficult.isSelected()) {
					
					rdbtnEasy.setSelected(false);
					
				}
				else {
					rdbtnEasy.setSelected(true);
				}
				
			}
		});
		
		rdbtnSimple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnSimple.isSelected()) {
					
					rdbtnComplex.setSelected(false);
					
				}
				else {
					rdbtnComplex.setSelected(true);
				}
				
			}
		});
		
		rdbtnComplex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnComplex.isSelected()) {
					
					rdbtnSimple.setSelected(false);
					
				}
				else {
					rdbtnSimple.setSelected(true);
				}
				
			}
		});
		
		rdbtnClassic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnClassic.isSelected()) {
					
					rdbtnRG.setSelected(false);
					rdbtnBY.setSelected(false);
				}
				else {
					rdbtnRG.setSelected(true);
					rdbtnBY.setSelected(true);
				}
				
			}
		});
		
		rdbtnRG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnRG.isSelected()) {
					
					rdbtnClassic.setSelected(false);
					rdbtnBY.setSelected(false);
				}
				else {
					rdbtnClassic.setSelected(true);
					rdbtnBY.setSelected(true);
				}
				
			}
		});		
		
		rdbtnBY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnBY.isSelected()) {
					
					rdbtnRG.setSelected(false);
					rdbtnClassic.setSelected(false);
				}
				else {
					rdbtnRG.setSelected(true);
					rdbtnClassic.setSelected(true);
				}
			}
		});
		
		rdbtnEnable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnEnable.isSelected()) {
					rdbtnDisable.setSelected(false);
				}
				else {
					rdbtnDisable.setSelected(true);
				}
				
			}
		});
		rdbtnDisable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnDisable.isSelected()) {
					rdbtnEnable.setSelected(false);
					
				}
				else {
					rdbtnEnable.setSelected(true);
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent aevt) {
		// This is a required method
		
		
	}
	
}
