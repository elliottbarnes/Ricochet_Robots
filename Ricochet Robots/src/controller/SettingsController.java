package controller;
import java.awt.*;


public class SettingsController {
	
	int playerNumber, playerCount;
	Color boardColor;
	Difficulty difficultyType;
	boolean hintsEnabled;
	boolean player1, player2, player3, player4;
	
	public boolean isPlayer1() {
		return player1;
	}

	public void setPlayer1(boolean player1) {
		this.player1 = player1;
	}

	public boolean isPlayer2() {
		return player2;
	}

	public void setPlayer2(boolean player2) {
		this.player2 = player2;
	}

	public boolean isPlayer3() {
		return player3;
	}

	public void setPlayer3(boolean player3) {
		this.player3 = player3;
	}

	public boolean isPlayer4() {
		return player4;
	}

	public void setPlayer4(boolean player4) {
		this.player4 = player4;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	public SettingsController() {
		
	}
	

	/*
	 * Getter/Setter for DifficultyType
	 */

	public Difficulty getDifficultyType() {
		return difficultyType;
	}




	public void setDifficultyType(Difficulty difficultyType) {
		this.difficultyType = difficultyType;
	}

	/*
	 * Getter/Setter for Hints
	 */
	
	public boolean isHintsEnabled() {
		return hintsEnabled;
	}

	public void setHintsEnabled(boolean hintsEnabled) {
		this.hintsEnabled = hintsEnabled;
	}
	
	/*
	 * Getter/Setter for BoardColor
	 */

	public Color getBoardColor() {
		return boardColor;
	}

	public void setBoardColor(Color boardColor) {
		this.boardColor = boardColor;
	}

	/*
	 * Getter/Setter for PlayerNumber
	 */

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
		playerCount ++;
	}
	
	/*
	 * Getter/Setter for PlayerCount
	 */

	public int getPlayerCount() {
		return playerCount;
	}

}
