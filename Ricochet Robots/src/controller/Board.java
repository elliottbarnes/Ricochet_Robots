package controller;

import java.awt.Color;
import java.util.Random;

import javax.swing.*;

public class Board extends JPanel {
	
	private int xcoord, ycoord;
	

	public Board(int xcoord, int ycoord) {
		super();
		this.setSize(50,50);
		this.xcoord = xcoord;
		this.ycoord = ycoord;
	}
	
	public void setColor( int xfor, int yfor)
	{	
		Color colour; 
		boolean column = (xfor==7 | xfor==8)?true:false;
		boolean row = (yfor==7 | yfor==8)?true:false;
		colour = (column==true & row==true )?Color.DARK_GRAY:Color.lightGray;

		this.setBackground( colour );
		
	} 
	public void setRobots( int xfor, int yfor)
	{	
		if(xfor==0 & yfor==0) {
			this.setBackground( Color.RED );
		}else if(xfor==0 & yfor==1) {
			this.setBackground( Color.BLUE );
		}else if(xfor==0 & yfor==2) {
			this.setBackground( Color.GREEN);
		}else if(xfor==0 & yfor==3) {
			this.setBackground( Color.yellow);
		}
	} 

	public int getXcoord() {
		return xcoord;
	}

	public void setXcoord(int xcoord) {
		this.xcoord = xcoord;
	}

	public int getYcoord() {
		return ycoord;
	}

	public void setYcoord(int ycoord) {
		this.ycoord = ycoord;
	}

}
