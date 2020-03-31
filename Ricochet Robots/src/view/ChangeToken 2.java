package view;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ChangeToken {
	private Stack<Integer> st;
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
			handler.addObject(new Barrier(270, 270, 50, 50, ID.Barrier));
			handler.addObject(new Token(276, 276, 36, 36, ID.Token, st.pop()));
		}
	}
}
