import java.awt.EventQueue;
import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmRicochetRobots;;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmRicochetRobots.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
ImageIcon img=new ImageIcon(this.getClass().getResource("/Background.jpg"));
	    
		frmRicochetRobots = new JFrame();
		frmRicochetRobots.setTitle("Ricochet Robots");
		frmRicochetRobots.getContentPane().setBackground(Color.GRAY);
		frmRicochetRobots.setBackground(Color.BLACK);
		frmRicochetRobots.setBounds(100, 100, 490, 450);
		frmRicochetRobots.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRicochetRobots.getContentPane().setLayout(null);
		
		//Button Help
		JButton btnHelp = new JButton("HELP");
		btnHelp.setBackground(Color.DARK_GRAY);
		btnHelp.setForeground(Color.WHITE);
		btnHelp.setBounds(149, 309, 200, 50);
		frmRicochetRobots.getContentPane().add(btnHelp);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//Button Load Game
		JButton btnLoadGame = new JButton("LOAD GAME");
		btnLoadGame.setBackground(Color.DARK_GRAY);
		btnLoadGame.setForeground(Color.WHITE);
		btnLoadGame.setBounds(149, 248, 200, 50);
		frmRicochetRobots.getContentPane().add(btnLoadGame);
		btnLoadGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//Button New Game
		JButton btnNewGame = new JButton("NEW GAME");
		btnNewGame.setForeground(Color.WHITE);
		btnNewGame.setBackground(Color.DARK_GRAY);
		btnNewGame.setBounds(149, 187, 200, 50);
		frmRicochetRobots.getContentPane().add(btnNewGame);
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SettingsMenu.main(null);
				frmRicochetRobots.setVisible(false);
			}
		});
		
		JLabel background; 
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0, 0, 490, 450);
		frmRicochetRobots.getContentPane().add(background);
	}

}
