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
		playerOneLbl.setBounds(53, 44, 39, 14);
		playerOneLbl.setForeground(Color.red);
		add(playerOneLbl);
		JLabel playerOneScore = new JLabel();
		playerOneScore.setBounds(97, 44, 32, 14);
		add(playerOneScore);
		playerOneScore.setText("score1");
		JLabel playerTwoLbl = new JLabel("Player 2");
		playerTwoLbl.setBounds(53, 69, 39, 14);

		playerTwoLbl.setForeground(Color.blue);
		add(playerTwoLbl);
		JLabel playerTwoScore = new JLabel();
		playerTwoScore.setBounds(97, 69, 32, 14);
		add(playerTwoScore);
		// implement scoring function, setText() parameter to String.scoreFunction(score)
		playerTwoScore.setText("score2");
		JLabel playerThreeLbl = new JLabel("Player 3");
		playerThreeLbl.setBounds(53, 91, 39, 14);

		playerThreeLbl.setForeground(Color.green);
		add(playerThreeLbl);
		JLabel playerThreeScore = new JLabel();
		playerThreeScore.setBounds(97, 91, 32, 14);
		add(playerThreeScore);
		playerThreeScore.setText("score3");
		JLabel playerFourLbl = new JLabel("Player 4");
		playerFourLbl.setBounds(53, 116, 39, 14);

		playerFourLbl.setForeground(Color.yellow);
		add(playerFourLbl);
		JLabel playerFourScore = new JLabel();
		playerFourScore.setBounds(97, 116, 32, 14);
		add(playerFourScore);
		playerFourScore.setText("score4");
		
		
		
		
	}

}
