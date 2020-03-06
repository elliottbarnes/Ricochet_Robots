package controller;

import view.TakeTurn;

public class Move {
	int Xc; //X coordinate
	int Yc; //Y coordinate
	
	public Move() {
		
		Xc= view.TakeTurn.getXcoord();
		Yc= view.TakeTurn.getYcoord();
	}
	
}
