package view;

import javax.swing.*;
import java.awt.*;

public class PlayerScorePanel extends JPanel {

	public PlayerScorePanel() {
		setSize(184,600);
		HintButton hntButton = new HintButton();
		setLayout(null);
		
		
		// player labels
		JLabel playerOneLbl = new JLabel("Player 1");
		playerOneLbl.setLocation(0, 0);
		playerOneLbl.setSize(39,14);
		playerOneLbl.setForeground(Color.red);
		add(playerOneLbl);
		JLabel playerOneScore = new JLabel();
		playerOneScore.setBounds(70, 0, 32, 14);
		add(playerOneScore);
		playerOneScore.setText("score1");
		JLabel playerTwoLbl = new JLabel("Player 2");
		playerTwoLbl.setLocation(0, 28);

		playerTwoLbl.setSize(39,14);

		playerTwoLbl.setForeground(Color.blue);
		add(playerTwoLbl);
		JLabel playerTwoScore = new JLabel();
		playerTwoScore.setBounds(70, 28, 32, 14);
		add(playerTwoScore);
		// implement scoring function, setText() parameter to String.scoreFunction(score)
		playerTwoScore.setText("score2");
		JLabel playerThreeLbl = new JLabel("Player 3");
		playerThreeLbl.setLocation(0, 56);
		
		playerThreeLbl.setSize(39,14);

		playerThreeLbl.setForeground(Color.green);
		add(playerThreeLbl);
		JLabel playerThreeScore = new JLabel();
		playerThreeScore.setBounds(70, 53, 32, 14);
		add(playerThreeScore);
		playerThreeScore.setText("score3");
		JLabel playerFourLbl = new JLabel("Player 4");
		playerFourLbl.setLocation(0, 84);

		playerFourLbl.setSize(39,14);

		playerFourLbl.setForeground(Color.yellow);
		add(playerFourLbl);
		JLabel playerFourScore = new JLabel();
		playerFourScore.setBounds(70, 84, 32, 14);
		add(playerFourScore);
		playerFourScore.setText("score4");
		
		
		
		
	}

}
