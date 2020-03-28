package controller;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GameTimer extends JPanel {
	int count = 61;

	public GameTimer() {
	
		JLabel tmrDisplay;
		Timer timer;
		
		tmrDisplay = new JLabel("...");
		tmrDisplay.setForeground(new Color(255, 0, 0));
		tmrDisplay.setFont(new Font("Chalkduster", Font.BOLD, 17));
		add(tmrDisplay);
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				if (count < 10 && count >= 0) {
					tmrDisplay.setText("0:0"+Integer.toString(count));
				}else if(count < 60 && count >= 0) {
					tmrDisplay.setText("0:"+Integer.toString(count));
				}else if(count == 60) {
					//tmrDisplay.setForeground(Color.RED);
					tmrDisplay.setText("1:00");
				}else {
					((Timer) (e.getSource())).stop();
				}
			}
		});
		timer.setInitialDelay(0);
		timer.start();
	}
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(200,200);
	}
		

}
