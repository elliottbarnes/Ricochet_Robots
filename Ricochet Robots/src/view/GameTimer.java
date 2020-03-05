package view;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GameTimer extends JPanel {
	int count = 0;

	public GameTimer() {
	
		JLabel tmrDisplay;
		Timer timer;
		
		tmrDisplay = new JLabel("...");
		tmrDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(tmrDisplay);
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				if (count < 10) {
					tmrDisplay.setText("0:0"+Integer.toString(count));
				}else if(count < 60) {
					tmrDisplay.setText("0:"+Integer.toString(count));
				}else if(count == 60) {
					tmrDisplay.setForeground(Color.RED);
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
