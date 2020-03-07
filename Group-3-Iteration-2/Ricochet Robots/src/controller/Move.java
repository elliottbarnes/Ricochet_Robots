package controller;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import view.GameGUI;

public class Move {
	private int Xc; //X coordinate
	private int Yc; //Y coordinate
	
	public Move() {
		Xc= view.GameGUI.getXcoord();
		Yc= view.GameGUI.getYcoord();
		
		view.GameGUI.setXcoord(15);
	}
	
}
