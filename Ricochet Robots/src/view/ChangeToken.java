package view;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ChangeToken {
	private Stack<Integer> st;
	private int currentToken;

	public ChangeToken() {
		st = new Stack<Integer>();
		for(int i=1; i<17; i++) {
			st.push(i);
		}
	}
	public void next(Handler handler, JFrame frmTakeTurn) {
		if(st.isEmpty() ) {
			handler.addObject(new Barrier(270, 270, 50, 50, ID.Barrier));
			JOptionPane.showMessageDialog(frmTakeTurn, "All tokens have been taken");
		}else {
			setCurrentToken(st.pop());
			handler.addObject(new Barrier(270, 270, 50, 50, ID.Barrier));
			handler.addObject(new Token(276, 276, 36, 36, getIDToken(getCurrentToken()), getCurrentToken()));
		}
	}
	
	public int getCurrentToken() {
		return currentToken;
	}
	public void setCurrentToken(int currentToken) {
		this.currentToken = currentToken;
	}
	public ID getIDToken(int num) {
		switch(num){
			case 1:
				return ID.Token1;
			case 2:
				return ID.Token2;
			case 3:
				return ID.Token3;
			case 4:
				return ID.Token4;
			case 5:
				return ID.Token5;
			case 6:
				return ID.Token6;
			case 7:
				return ID.Token7;
			case 8:
				return ID.Token8;
			case 9:
				return ID.Token9;
			case 10:
				return ID.Token10;
			case 11:
				return ID.Token11;
			case 12:
				return ID.Token12;
			case 13:
				return ID.Token13;
			case 14:
				return ID.Token14;
			case 15:
				return ID.Token15;
			case 16:
				return ID.Token16;
			default:
				return null;
		}
	}
}
