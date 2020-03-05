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
		add(tmrDisplay);
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				if (count < 61) {
					tmrDisplay.setText(Integer.toString(count));
				} else {
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
