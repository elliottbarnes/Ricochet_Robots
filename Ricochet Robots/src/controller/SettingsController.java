package controller;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class SettingsController {
	
	int playerNumber, playerCount;
	Color boardColor;
	Board boardType;
	Difficulty difficultyType;
	boolean hintsEnabled;
	
	public SettingsController() {
		
		this.boardType = boardType;
		this.boardColor = boardColor;
		this.playerNumber = playerNumber;
		this.playerCount = playerCount;
		this.difficultyType = difficultyType;
		this.hintsEnabled = hintsEnabled;
		
	}
	
	/*
	 * Getter/Setter for BoardType
	 */
	
	public Board getBoardType() {
		return boardType;
	}




	public void setBoardType(Board boardType) {
		this.boardType = boardType;
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
