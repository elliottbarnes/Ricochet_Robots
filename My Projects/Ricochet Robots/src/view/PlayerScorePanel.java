package view;

import javax.swing.*;
import java.awt.*;

public class PlayerScorePanel extends JPanel {

	public PlayerScorePanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setSize(184,600);
		HintButton hntButton = new HintButton();
		
		
		// player labels
		JLabel playerOneLbl = new JLabel("Player 1");
		playerOneLbl.setSize(100,500);
		playerOneLbl.setForeground(Color.red);
		add(playerOneLbl);
		JLabel playerOneScore = new JLabel();
		add(playerOneScore);
		playerOneScore.setText("score1");
		JLabel playerTwoLbl = new JLabel("Player 2");

		playerTwoLbl.setSize(100,500);

		playerTwoLbl.setForeground(Color.blue);
		add(playerTwoLbl);
		JLabel playerTwoScore = new JLabel();
		add(playerTwoScore);
		// implement scoring function, setText() parameter to String.scoreFunction(score)
		playerTwoScore.setText("score2");
		JLabel playerThreeLbl = new JLabel("Player 3");
		
		playerThreeLbl.setSize(100,500);

		playerThreeLbl.setForeground(Color.green);
		add(playerThreeLbl);
		JLabel playerThreeScore = new JLabel();
		add(playerThreeScore);
		playerThreeScore.setText("score3");
		JLabel playerFourLbl = new JLabel("Player 4");

		playerFourLbl.setSize(100,500);

		playerFourLbl.setForeground(Color.yellow);
		add(playerFourLbl);
		JLabel playerFourScore = new JLabel();
		add(playerFourScore);
		playerFourScore.setText("score4");
		
		
		
		
	}

}
