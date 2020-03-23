package controller;

import javax.swing.JButton;
import javax.swing.JLabel;

public class SaveData implements java.io.Serializable {
	
	private static final long serialVersionUID = 2L;
	
	private int player;
	private JLabel lblP1, lblP2, lblP3, lblP4,lblp1bid, lblp2bid, lblp3bid, lblp4bid;
	private JButton btnP1, btnP2, btnP3, btnP4;
	private Difficulty difficultyType;
	private boolean hintsEnabled;
	
	public Difficulty getDifficultyType() {
		return difficultyType;
	}
	public void setDifficultyType(Difficulty difficultyType) {
		this.difficultyType = difficultyType;
	}
	public boolean isHintsEnabled() {
		return hintsEnabled;
	}
	public void setHintsEnabled(boolean hintsEnabled) {
		this.hintsEnabled = hintsEnabled;
	}
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	public JLabel getLblP1() {
		return lblP1;
	}
	public void setLblP1(JLabel lblP1) {
		this.lblP1 = lblP1;
	}
	public JLabel getLblP2() {
		return lblP2;
	}
	public void setLblP2(JLabel lblP2) {
		this.lblP2 = lblP2;
	}
	public JLabel getLblP3() {
		return lblP3;
	}
	public void setLblP3(JLabel lblP3) {
		this.lblP3 = lblP3;
	}
	public JLabel getLblP4() {
		return lblP4;
	}
	public void setLblP4(JLabel lblP4) {
		this.lblP4 = lblP4;
	}
	public JLabel getLblp1bid() {
		return lblp1bid;
	}
	public void setLblp1bid(JLabel lblp1bid) {
		this.lblp1bid = lblp1bid;
	}
	public JLabel getLblp2bid() {
		return lblp2bid;
	}
	public void setLblp2bid(JLabel lblp2bid) {
		this.lblp2bid = lblp2bid;
	}
	public JLabel getLblp3bid() {
		return lblp3bid;
	}
	public void setLblp3bid(JLabel lblp3bid) {
		this.lblp3bid = lblp3bid;
	}
	public JLabel getLblp4bid() {
		return lblp4bid;
	}
	public void setLblp4bid(JLabel lblp4bid) {
		this.lblp4bid = lblp4bid;
	}
	public JButton getBtnP1() {
		return btnP1;
	}
	public void setBtnP1(JButton btnP1) {
		this.btnP1 = btnP1;
	}
	public JButton getBtnP2() {
		return btnP2;
	}
	public void setBtnP2(JButton btnP2) {
		this.btnP2 = btnP2;
	}
	public JButton getBtnP3() {
		return btnP3;
	}
	public void setBtnP3(JButton btnP3) {
		this.btnP3 = btnP3;
	}
	public JButton getBtnP4() {
		return btnP4;
	}
	public void setBtnP4(JButton btnP4) {
		this.btnP4 = btnP4;
	}
	
	

}
