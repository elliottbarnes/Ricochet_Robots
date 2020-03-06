package controller;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import view.GameGUI;

public class Move {
	private int Xc; //X coordinate
	private int Yc; //Y coordinate
//	private GridSquare[][] gridSquares;
	
	public Move(int num) {
		Xc= view.GameGUI.getXcoord();
		Yc= view.GameGUI.getYcoord();
//		System.out.print(Xc+","+Yc);
	}
	
}
