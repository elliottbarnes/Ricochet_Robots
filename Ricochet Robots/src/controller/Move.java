package controller;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import view.TakeTurn;

public class Move {
	private int Xc; //X coordinate
	private int Yc; //Y coordinate
//	private GridSquare[][] gridSquares;
	
	public Move(int num) {
		Xc= view.TakeTurn.getXcoord();
		Yc= view.TakeTurn.getYcoord();
//		System.out.print(Xc+","+Yc);
	}
	
}
