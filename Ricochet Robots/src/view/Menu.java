package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.*;
import javax.swing.border.Border;

public class Menu extends JFrame implements ActionListener {

	private JFrame frmRicochetRobots;
	public Menu() {
		
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
		btnHelp.setFont(new Font("Chalkduster", Font.BOLD, 15));
		btnHelp.setBackground(new Color(52,101,36));
		btnHelp.setForeground(new Color(210,170,153));
		btnHelp.setBounds(149, 309, 200, 50);
		btnHelp.setOpaque(true);
		btnHelp.setBorderPainted(false);
		frmRicochetRobots.getContentPane().add(btnHelp);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Help();
				frmRicochetRobots.setVisible(false);
			}
		});
		
		//Button Load Game
		JButton btnLoadGame = new JButton("LOAD GAME");
		btnLoadGame.setOpaque(true);
		btnLoadGame.setBorderPainted(false);
		btnLoadGame.setFont(new Font("Chalkduster", Font.BOLD, 15));
		btnLoadGame.setBackground(new Color(52,101,36));
		btnLoadGame.setForeground(new Color(218,212,94));
		btnLoadGame.setBounds(149, 248, 200, 50);
		frmRicochetRobots.getContentPane().add(btnLoadGame);
		btnLoadGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					SaveData data = (SaveData) ResourceManager.load("1.save");
					
				}
				catch(Exception ex) {
					System.out.println("Unable to load save data: "+ ex.getMessage());
				}
				
			}
		});
		
		//Button New Game
		JButton btnNewGame = new JButton("NEW GAME");
		btnNewGame.setFont(new Font("Chalkduster", Font.BOLD, 15));
		btnNewGame.setForeground(new Color(109,194,202));
		btnNewGame.setBackground(new Color(52,101,36));
		btnNewGame.setOpaque(true);
		btnNewGame.setBorderPainted(false);
		btnNewGame.setBounds(149, 187, 200, 50);
		frmRicochetRobots.getContentPane().add(btnNewGame);
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Settings();
				frmRicochetRobots.setVisible(false);
			}
		});
		
		JLabel background; 
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0, 0, 490, 450);
		frmRicochetRobots.getContentPane().add(background);
	
		frmRicochetRobots.setVisible(true);	

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//This is a required method
	}
	

}
